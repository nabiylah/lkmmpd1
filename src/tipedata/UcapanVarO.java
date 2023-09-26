/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipedata;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class UcapanVarO {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukan kalimat : ");
        String kalimat = masukan.nextLine();
        System.out.print("Masukan kalimat lainnya : ");
        String kalimat2 = masukan.nextLine();
        
        System.out.println("---------------------------------");
        System.out.println(kalimat + " dan " + kalimat2);
        
        
    }
    
}
