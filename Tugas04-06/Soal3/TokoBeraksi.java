/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal3;

import java.util.Scanner;

/**
 *
 * @author stevedownes
 */
public class TokoBeraksi { // saya maunya "TokBeraksi" aja
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TokoSerbaAda toko = new TokoSerbaAda();

        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");

        System.out.print("Masukkan Item Barang : ");
        int jumlahItem = input.nextInt();

        Barang[] belanjaBarang = new Barang[jumlahItem];
        int[] belanjaJumlah = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode          : ");
            String kode = input.next();
            
            Barang ditemukan = toko.cariBarang(kode);
            
            if (ditemukan == null) {
                System.out.println("Kode tidak ditemukan, silakan coba lagi.");
                i--; 
                continue; 
            }

            System.out.print("Masukkan jumlah Beli   : ");
            int qty = input.nextInt();

            belanjaBarang[i] = ditemukan;
            belanjaJumlah[i] = qty;
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("**************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("==============================================================");
        
        int totalBayar = 0;
        for (int i = 0; i < jumlahItem; i++) {
            int subtotal = belanjaBarang[i].getHarga() * belanjaJumlah[i];
            totalBayar += subtotal;
            
            System.out.printf("%-3d %-12s %-12s %-6d %-12d %-10d\n", 
                (i + 1), 
                belanjaBarang[i].getKode(), 
                belanjaBarang[i].getNama(), 
                belanjaBarang[i].getHarga(), 
                belanjaJumlah[i], 
                subtotal);
        }
        
        System.out.println("==============================================================");
        System.out.printf("Total Bayar %44d\n", totalBayar);
        System.out.println("==============================================================");

        input.close();
    }
}
