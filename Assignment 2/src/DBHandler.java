import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBHandler extends Configs{
    private final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        System.out.println("Connection is successful");
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
