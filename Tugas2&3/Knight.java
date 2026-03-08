/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas02.pkg03;

/**
 *
 * @author stevedownes
 */
public class Knight extends Entity{
    private double defense;
    
    public Knight(String nama, double hp, double attack, double defense){
        super(nama, hp, attack);
        this.defense = defense;
        
    }
    
    public void infoStatus(){
        super.infoStatus();
        System.out.println("Defense : " + defense);
    }
}
