package jobsheet5;
import java.util.Scanner;

public class wifi23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa): ");
        String pengguna = sc.nextLine();

        switch (pengguna) {
            case "dosen":
                System.out.println("Akses WiFi diberikan (dosen)");
                break;
            case "mahasiswa":
                System.out.print("Masukkan jumlah SKS: ");
                int sks = sc.nextInt();

                if (sks >= 18) {
                    System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
                } else {
                    System.out.println("Akses ditolak, SKS kurang dari 18");
                }
                break;
            default:
                System.out.println("Akses ditolak");
 }
}
}