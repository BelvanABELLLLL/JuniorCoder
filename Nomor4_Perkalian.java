import javax.swing.JOptionPane;

public class Nomor4_Perkalian {
    public static void main(String[] args) {

        double nilai1 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai 1:"));
        double nilai2 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai 2:"));

        double hasil = nilai1 * nilai2;

        JOptionPane.showMessageDialog(null, "Nilai 1 : " + nilai1 + "\nNilai 2 : " + nilai2 + "\nHasil : " + hasil, "Hasil Perkalian", JOptionPane.INFORMATION_MESSAGE);
    }
}
