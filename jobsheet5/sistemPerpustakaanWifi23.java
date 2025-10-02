package jobsheet5;

import java.util.Scanner;

public class sistemPerpustakaanWifi23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Apakah mahasiswa aktif? (Ya/Tidak): ");
        String statusAktif = sc.nextLine().trim();
        
        if (statusAktif.equalsIgnoreCase("Ya")) {
            System.out.print("Apakah punya kartu mahasiswa? (Ya/Tidak): ");
            String punyaKartu = sc.nextLine().trim();
            
            if (punyaKartu.equalsIgnoreCase("Ya")) {
                System.out.println("Akses perpustakaan diterima");
                
                System.out.print("Sudah registrasi WiFi? (Ya/Tidak): ");
                String registrasi = sc.nextLine().trim();
                
                if (registrasi.equalsIgnoreCase("Ya")) {
                    System.out.println("Akses WiFi diterima");
                } else {
                    System.out.println("Silakan registrasi WiFi terlebih dahulu");
                }
            } else {
                System.out.println("Akses ditolak. Bawa kartu mahasiswa");
            }
        } else {
            System.out.println("Akses ditolak. Status mahasiswa tidak aktif");
        }
        
        sc.close();
    }
}