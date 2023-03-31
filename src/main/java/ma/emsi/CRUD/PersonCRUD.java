package ma.emsi.CRUD;

import ma.emsi.Models.Person;
import ma.emsi.other.IdGenerator;

import java.sql.*;

public class PersonCRUD implements ICrud<Person>{
    Connection conn;

    public PersonCRUD(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean insert(Person person) {
        String sql = "INSERT INTO Person (idPerson, email, password, numeroTel) VALUES (?, ?, ?, ?)";
        int rowsInserted = 0;
        try {
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, IdGenerator.generateId());
            statement.setString(2, person.getEmail());
            statement.setString(3, person.getPassword());
            statement.setInt(4, person.getNumeroTel());

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

    public boolean isPerson(String email, String password) {
        String sql = "SELECT * FROM PERSON WHERE email = ? and password = ?";
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
