
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Adm
 */
public class conectaDAO {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public Connection getConexao() {

        return conn;
    }

    public boolean connectDB() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/uc11",
                    "root", "02111967");

            return true;

        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println("Erro ConectaDAO " + ex.getMessage());

            //JOptionPane.showMessageDialog(null, "Erro ConectaDAO" + erro.getMessage());
            return false;
        }

    }

    public void desconectarDB() {

        try {

            conn.close();

        } catch (Exception e) {

        }

    }

}
