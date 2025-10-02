package jobsheet5;

import java.util.Scanner;
public class ifCetakKRS23 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean uktLunas;

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        uktLunas = sc.nextBoolean();

        if (uktLunas){
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");
        }

        System.out.println("--- Hasil dengan Ternary Operator ---");
        String hasilTernary = uktLunas ? "Boleh cetak KRS" : "Tidak boleh cetak KRS";
        System.out.println("Hasil ternary: " + hasilTernary);

    }
    
}
