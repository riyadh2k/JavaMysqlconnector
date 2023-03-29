import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Application started");

        //Initiera Objekt

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        while (true){
            System.out.println("Gör ditt menyval");
            System.out.println("----------------");
            System.out.println("1. Hämta Data från DB");
            System.out.println("Avsluta");
        }
    }
}