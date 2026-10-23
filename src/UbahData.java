import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UbahData {

    public static void main(String[] args) throws SQLException {
        
        Koneksi koneksi = new Koneksi();

        String SQLITE = "UPDATE siswa SET nama_siswa = ? WHERE id_siswa = ?";

        PreparedStatement stmt = koneksi.myKoneksi().prepareStatement(SQLITE);
        stmt.setString(1, "Natasha Belle");
        stmt.setInt(2, 6);
        stmt.execute();

        System.out.println("Data Berhasil diperaharui!");
    }
    
}
