/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Praktikum2 {
    public static void main(String[] args) {
       Scanner masukan = new Scanner(System.in);
       
        System.out.print("masukan kalimat 1 : ");
        String Kalimat1 = masukan.nextLine();
        System.out.print("masukan kalimat 2 : ");
        String Kalimat2 = masukan.nextLine();
        System.out.print("masukan kalimat 3 : ");
        String Kalimat3 = masukan.nextLine();
        
        System.out.println("---------------------------");
        System.out.println( Kalimat1 + "\n" + Kalimat2 + "\n\t" + Kalimat3);
    }
}
