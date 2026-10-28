import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TampilData {
    

    public void tampil() throws SQLException{

        Koneksi koneksi = new Koneksi();

        String SQLITE = "SELECT * FROM siswa";
        PreparedStatement stmt = koneksi.myKoneksi().prepareStatement(SQLITE);
        ResultSet hasil = stmt.executeQuery();
        
        while (hasil.next()) {
            System.out.println(hasil.getString("nama_siswa"));
            System.out.println(hasil.getString("jenis_kelamin"));
        }
    }

    public static void main(String[] args) throws SQLException {
        TampilData t = new TampilData();
        t.tampil();
    }
}
