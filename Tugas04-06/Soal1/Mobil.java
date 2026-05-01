/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author stevedownes
 */
public class Mobil extends Kendaraan{
    private int jmlPintu;
    
    public Mobil(String merk, int kecepatanMaksimal, int jmlPintu){
        super(merk, kecepatanMaksimal);
        this.jmlPintu = jmlPintu;
    }
    
    @Override
    void gerakan(){
        System.out.println("Mobil " + merk + " melaju di jalan raya!");
    }
    
    @Override
    void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Jumlah Pintu: " + jmlPintu);
    }
}
