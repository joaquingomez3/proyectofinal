package universidad1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private final String base = "universidad";
    private final String url="jdbc:mysql://localhost:3306/" + base;
    private final String user="root";
    private final String pass="";
    private Connection con;
    
    public Connection getConnection()
    {
        if(con==null)
        {
            try
            {
                Class.forName("org.mariadb.jdbc.Driver");
                con = (Connection)DriverManager.getConnection(url, user, pass);
            }
            catch (SQLException |ClassNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null, "Error: " + ex);
            }
        }
                return con;
    }

}
