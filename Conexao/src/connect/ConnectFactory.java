package connect;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConnectFactory {
    
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/netbeans_mysql", "root", "22Comanf2001@");
        
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de conexão");
            return null;
        }
    }
}
