import java.util.Scanner;

public class Nomor2_Diskon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Harga Barang: Rp ");
        double harga = input.nextDouble();

        System.out.print("Diskon (%): ");
        double diskon = input.nextDouble();

        double diskonRupiah = harga * diskon / 100;
        double totalHarga = harga - diskonRupiah;

        System.out.println("\nHarga Barang: Rp " + harga);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Diskon (Rp.): Rp " + diskonRupiah);
        System.out.println("Total Harga: Rp " + totalHarga);

        input.close();
    }
}