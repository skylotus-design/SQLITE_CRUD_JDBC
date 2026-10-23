import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TambahData {

    public static void main(String[] args) throws SQLException {
        
        String SQL = "INSERT INTO siswa(nama_siswa, jenis_kelamin, kelas, nilai_ujian) VALUES(?, ?, ?, ?)";

        Koneksi koneksi = new Koneksi();
        PreparedStatement stmt = koneksi.myKoneksi().prepareStatement(SQL);

        stmt.setString(1, "Heru Cibaduyut");
        stmt.setString(2, "Tutup Botol");
        stmt.setString(3, "12A");
        stmt.setInt(4, 60);
        stmt.execute();

        System.out.println("Data Baru Berhasil ditambahkan!");
    }
    
}
