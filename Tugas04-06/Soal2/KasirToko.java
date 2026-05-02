/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

import java.util.Scanner;

/**
 *
 * @author stevedownes
 */
public class KasirToko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan : ");
        String namaPelanggan = input.nextLine();
        
        System.out.print("Total harga belanja    : ");
        double totalBelanja = input.nextDouble();

        System.out.println("Pilih kategori member  :");
        System.out.println("1. Regular   2. Silver   3. Gold   4. Platinum");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

        double persentaseDiskon = 0;
        String kategoriMember = "";

        switch (pilihan) {
            case 1:
                kategoriMember = "Regular";
                persentaseDiskon = 0.0;
                break;
            case 2:
                kategoriMember = "Silver";
                persentaseDiskon = 0.1;
                break;
            case 3:
                kategoriMember = "Gold";
                persentaseDiskon = 0.2;
                break;
            case 4:
                kategoriMember = "Platinum";
                persentaseDiskon = 0.3;
                break;
            default:
                System.out.println("Kategori tidak dikenal, diskon tidak diterapkan");
                kategoriMember = "Tidak Diketahui";
                persentaseDiskon = 0.0;
                break;
        }

        double nilaiDiskon = totalBelanja * persentaseDiskon;
        double totalBayar = totalBelanja - nilaiDiskon;

        String metodePembayaran = "";
        if (totalBayar < 50000) {
            metodePembayaran = "Tunai";
        } else if (totalBayar >= 50000 && totalBayar < 200000) {
            metodePembayaran = "Tunai / Transfer";
        } else {
            metodePembayaran = "Tunai / Transfer / Kartu Kredit";
        }

        System.out.println("\n========= STRUK PEMBAYARAN =========");
        System.out.println("Nama Pelanggan   : " + namaPelanggan);
        System.out.println("Kategori Member  : " + kategoriMember);
        System.out.printf("Total Belanja    : Rp %,.2f%n", totalBelanja);
        System.out.printf("Diskon (%.0f%%)     : Rp %,.2f%n", (persentaseDiskon * 100), nilaiDiskon);
        System.out.printf("Total Bayar      : Rp %,.2f%n", totalBayar);
        System.out.println("------------------------------------");
        System.out.println("Metode Pembayaran: " + metodePembayaran);
        System.out.println("====================================");

        input.close();
    }
}
