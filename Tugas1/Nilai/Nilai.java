/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nilai;

/**
 *
 * @author stevedownes
 */
public class Nilai {

    String nim, nama;
    double absen, tugas, uts, uas, nilaiAkhir;
    
    void Nilai(){
        nilaiAkhir = (absen * 0.10) + (tugas * 0.20) + (uts * 0.30) + (uas * 40);
    }
    
    void CetakNilai(){
        System.out.println("Nama                : " + nama);
        System.out.println("NIM                 : " + nim);
        System.out.println("Nilai Absen[10%]    : " + absen);
        System.out.println("Nilai Tugas[20%]    : " + tugas);
        System.out.println("Nilai UTS[30%]      : " + uts);
        System.out.println("Nilai UAS[40%]      : " + uas);
        System.out.println("Nilai Akhir         : " + nilaiAkhir);
    }
}
