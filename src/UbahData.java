import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UbahData {

    public static void main(String[] args) throws SQLException {
        
        Koneksi koneksi = new Koneksi();

        String SQLITE = "UPDATE siswa SET jenis_kelamin = ? WHERE id_siswa = ?";

        PreparedStatement stmt = koneksi.myKoneksi().prepareStatement(SQLITE);
        stmt.setString(1, "Gak Puguh");
        stmt.setInt(2, 5);
        stmt.execute();

        System.out.println("Data Berhasil diperaharui!");
    }
    
}
