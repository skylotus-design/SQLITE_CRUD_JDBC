import java.sql.SQLException;
import java.sql.PreparedStatement;

public class BuatTabel {

    public static void main(String[] args) throws SQLException {
        Koneksi koneksi = new Koneksi();

        String SQL = "CREATE TABLE IF NOT EXISTS siswa(id_siswa INTEGER PRIMARY KEY AUTOINCREMENT, nama_siswa VARCHAR NOT NULL, jenis_kelamin VARCHAR NOT NULL, kelas VARCHAR NOT NULL, nilai_ujian INTEGER NOT NULL)";

        
        PreparedStatement stmt = koneksi.myKoneksi().prepareStatement(SQL);
        stmt.execute();

        System.out.println("Tabel Berhasil Dibuat");
    }
}

