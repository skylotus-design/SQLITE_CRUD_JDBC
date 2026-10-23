import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HapusData {
    
    public void hapus() throws SQLException{

        Koneksi koneksi = new Koneksi();

        String SQLITE = "DELETE FROM siswa WHERE id_siswa = ?";
        PreparedStatement stmt = koneksi.myKoneksi().prepareStatement(SQLITE);
        stmt.setInt(1, 4);
        stmt.execute();

        System.out.println("Siswa tolol berhasil dibuang!");
    }

    public static void main(String[] args) throws SQLException {
        HapusData hapus = new HapusData();
        hapus.hapus();
    }
}
