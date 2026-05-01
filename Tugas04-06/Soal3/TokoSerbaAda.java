/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal3;

import java.util.ArrayList;

/**
 *
 * @author stevedownes
 */
public class TokoSerbaAda {
    public ArrayList<Barang> katalog = new ArrayList<>();

    public TokoSerbaAda() {
        katalog.add(new Barang("a001", "Buku", 3000));
        katalog.add(new Barang("a002", "Pensil", 4000));
        katalog.add(new Barang("a003", "Pulpen", 5000));
        katalog.add(new Barang("a004", "Penghapus", 2000));
        katalog.add(new Barang("a005", "Penggaris", 3500));
    }

    public Barang cariBarang(String kode) {
        for (Barang b : katalog) {
            if (b.getKode().equalsIgnoreCase(kode)) {
                return b;
            }
        }
        return null;
    }
}
