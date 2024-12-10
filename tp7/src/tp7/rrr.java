package tp7;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class rrr {
    // Informations de connexion
    private static final String URL = "jdbc:mysql://localhost:3306/bdtest";
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Charger le driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Essayer de se connecter à la base de données
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie à la base de données MySQL !");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC MySQL non trouvé !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données MySQL.");
            e.printStackTrace();
        } finally {
            try {
                // Fermer la connexion si elle a été ouverte
                if (connection != null) {
                    connection.close();
                    System.out.println("Connexion fermée.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

