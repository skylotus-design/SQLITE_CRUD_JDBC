import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    public Connection myKoneksi() throws SQLException{
        String url = "jdbc:sqlite:db/database.db";
        Connection konn = DriverManager.getConnection(url);
            System.out.println("Koneksi berhasil");
            return konn;
    }

    public static void main(String[] args) throws SQLException {
        Koneksi koneksi = new Koneksi();
        koneksi.myKoneksi();
    }

}

