/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author stevedownes
 */
class Motor extends Kendaraan {
    private String jenisMesin;

    // Constructor Motor
    public Motor(String merk, int kecepatanMaksimal, String jenisMesin) {
        super(merk, kecepatanMaksimal);
        this.jenisMesin = jenisMesin;
    }

    @Override
    void gerakan() {
        System.out.println("Motor " + merk + " melaju di jalan!");
    }

    @Override
    void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}