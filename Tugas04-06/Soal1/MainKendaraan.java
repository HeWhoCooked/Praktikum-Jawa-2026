/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author stevedownes
 */
public class MainKendaraan {
    public static void main(String[] args){
        Kendaraan k1 = new Mobil("Ompreng MBG", 160, 4);
        Kendaraan k2 = new Motor("motoran", 200, "4-Tak");
        k1.infoKendaraan();
        k1.gerakan();
        k2.infoKendaraan();
        k2.gerakan();
    }
}
