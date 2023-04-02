package ma.emsi.billingsystem.DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connector {
    private String dbURL = "jdbc:mysql://localhost:3306/billingsystem";
    private String username = "root";
    private String password = "";
    private Connection conn;


    public Connector() {
        Connect();
    }
    public Connection getConn() { return conn;}


    public void Connect() {
        try {
            conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null)System.out.println("Connected");
            else System.out.println("Problems connecting, Retry Later!!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }





    public void close() {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Connection closed");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
