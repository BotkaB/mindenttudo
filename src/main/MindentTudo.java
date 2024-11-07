/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import modell.FeladatMegold;

/**
 *
 * @author BotkaBianka(SZOFT_F_
 */
public class MindentTudo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FeladatMegold feladatMegold= new FeladatMegold();
        
        String sz= feladatMegold.getNyeroSzamokStr();
        
        System.out.println("Megjátszható számok:");
        
        int []szamok=feladatMegold.getNyeroSzamok();
        
        System.out.println("Megjátszható számok:");
    }
    
}
