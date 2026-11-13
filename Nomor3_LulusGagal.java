import javax.swing.JOptionPane;
public class Nomor3_LulusGagal {
    public static void main(String[] args) {

        double nilai1 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai 1:"));
        double nilai2 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai 2:"));
        double nilai3 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai 3:"));

        double rata = (nilai1 + nilai2 + nilai3) / 3;
        String hasil;

        if (rata >= 60) {
            hasil = "LULUS";
        } else {
            hasil = "GAGAL";
        }

        String pesan = "Nilai 1 : " + nilai1
            + "\nNilai 2 : " + nilai2
            + "\nNilai 3 : " + nilai3
            + "\nRata-rata : " + rata
            + "\nHasil : " + hasil;

        JOptionPane.showMessageDialog(null, pesan, "Hasil Kelulusan", JOptionPane.INFORMATION_MESSAGE);
    }
}
