package jobsheet5;

import java.util.Scanner;
public class flowchart23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Program Menentukan Bilangan Genap atau Ganjil ===");
        
        int angka;
        System.out.print("Masukkan sebuah bilangan: ");
        angka = sc.nextInt();
        
        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
        
    }
}
    

