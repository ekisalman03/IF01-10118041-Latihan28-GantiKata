/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118041.latihan28.gantikata;
import java.util.Scanner;
/**
 * Nama      : Eki salman sya'bani
 * Kelas     : IF-1
 * NIM       : 10118041
 * Deskripsi : Mengganti kata yang dipilih
 * @author Eki
 */

public class IF0110118041Latihan28GantiKata {
    /**
    * @param args the command line arguments
    */

    public static void main(String[] args) {

        // TODO code application logic here

         String kalimatawal, kalimatbaru, cari, ganti;

        Scanner masuk = new Scanner(System.in);

        //input
        System.out.println("=====Program Mengganti Kata=====");
        System.out.print("Masukkan Kalimat\t: ");
        kalimatawal = masuk.nextLine();
        System.out.print("Ganti Kata\t\t: ");
        cari = masuk.nextLine();
        System.out.print("Menjadi Kata\t\t: ");
        ganti = masuk.nextLine();
        //output
        kalimatbaru = kalimatawal.replace(cari, ganti);
        System.out.println("\n======Hasil Formatting=====");
        System.out.printf("Kalimat awal\t: %s%n", kalimatawal);
        System.out.printf("Kalimat baru\t: %s%n", kalimatbaru);
    }
    
}