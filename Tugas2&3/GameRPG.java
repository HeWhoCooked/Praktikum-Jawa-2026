/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas02.pkg03;

/**
 *
 * @author stevedownes
 */
public class GameRPG {
    public static void main(String[] args){
        Entity player = new Entity("Tupai Lightning", 100, 250);
        player.infoStatus();
        System.out.println();
        
        Knight knight = new Knight("Vlad", 100, 250, 100);
        knight.infoStatus();
        System.out.println();
    }
}
