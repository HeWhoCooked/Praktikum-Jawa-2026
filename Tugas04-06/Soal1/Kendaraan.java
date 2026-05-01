/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author stevedownes
 */
abstract class Kendaraan {
    protected String merk;
    protected int kecepatanMaksimal;
    
    public Kendaraan(String merk, int kecepatanMaksimal){
        this.merk = merk;
        this.kecepatanMaksimal = kecepatanMaksimal;
    }
    
    abstract void gerakan();
    
    void infoKendaraan(){
        System.out.println("Merk                : " + merk);
        System.out.println("Kecepatan Maksimal  : " + kecepatanMaksimal);
    }
}
