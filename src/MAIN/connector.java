package MAIN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class connector {
    private static Connection con;

    public static void main(String[] args) {
        ConnectDb();
    }

    public static Connection ConnectDb() {
        try {
          Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arsystem", "root","bourbon5");
           JOptionPane.showMessageDialog(null, "Connection Established");
            return con;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return con;
    }
}
