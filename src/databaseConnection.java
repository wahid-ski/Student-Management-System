

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Albari Yasir Wahid
 */
public class databaseConnection {
    // C:\Users\User\Documents\NetBeansProjects\student\lib
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // Updated driver class
    final static String DB_URL = "jdbc:mysql://localhost:3306/student";
    
    // Database credentials
    final static String USER = "root";
    final static String PASS = "root";
    
    public static Connection connection() {
        try {
            // Load the JDBC driver
            Class.forName(JDBC_DRIVER);
            
            // Establish the connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            // Show error message if the connection fails
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
