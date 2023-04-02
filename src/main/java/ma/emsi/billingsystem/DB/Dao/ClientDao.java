package ma.emsi.billingsystem.DB.Dao;
import ma.emsi.billingsystem.Models.Client;
import ma.emsi.billingsystem.Utilities.idGenerator;
import java.sql.*;


    public class ClientDao implements IDao<Client>{
        Connection conn;

        public ClientDao(Connection conn) {
            this.conn = conn;
        }

        @Override
        public boolean insert(Client client) {
            String sql = "INSERT INTO Client (idClient, email, password, numeroTel) VALUES (?, ?, ?, ?)";
            int rowsInserted = 0;
            try {
                PreparedStatement statement = conn.prepareStatement(sql);

                statement.setString(1, idGenerator.generateId());
                statement.setString(2, client.getEmail());
                statement.setString(3, client.getPassword());
                statement.setInt(4, client.getNumeroTel());

                rowsInserted = statement.executeUpdate();

            }catch (SQLException e) {
                e.printStackTrace();
            }

            return rowsInserted>0 ? true: false;
        }

        @Override
        public ResultSet selectAll()  {
            return null;
        }

        public boolean isClient(String email, String password) {
            String sql = "SELECT * FROM client WHERE email = ? and password = ?";
            ResultSet resultSet = null;
            try {
                PreparedStatement statement = conn.prepareStatement(sql);

                statement.setString(1, email);
                statement.setString(2, password);

                resultSet = statement.executeQuery();


                return resultSet.next();
            }catch(SQLException e) {
                e.printStackTrace();
            }

            return false;


        }
    }
