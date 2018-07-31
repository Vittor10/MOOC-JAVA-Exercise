package Databese;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLAccess {
    private Connection con = null;

    public Connection getConnection() throws ClassNotFoundException, SQLException {


        //Caricare il driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Setup della Connection
        con = DriverManager.getConnection("jdbc:mysql://localhost/dbprova?user=root&password=password&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&ssl=false");


        return con;
    }
}
