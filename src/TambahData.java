import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TambahData {

    public static void main(String[] args) throws SQLException {
        
        String SQLITE = "INSERT INTO siswa(nama_siswa, jenis_kelamin, kelas, nilai_ujian) VALUES(?, ?, ?, ?)";

        Koneksi koneksi = new Koneksi();
        PreparedStatement stmt = koneksi.myKoneksi().prepareStatement(SQLITE);

        stmt.setString(1, "Ujang Pacul");
        stmt.setString(2, "Beat Karbu");
        stmt.setString(3, "12A");
        stmt.setInt(4, 65);
        stmt.execute();

        System.out.println("Data Baru Berhasil ditambahkan!");
    }
    
}
