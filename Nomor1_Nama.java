import java.util.Scanner;

public class Nomor1_Nama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        var huruf4 = nama.charAt(3);
        var huruf5 = nama.charAt(4);
        var huruf6 = nama.charAt(5);
        var huruf7 = nama.charAt(6);

        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + nim);
        System.out.println("Empat huruf     : " + huruf4 + huruf5 + huruf6 + huruf7);

        input.close();
    }
}
