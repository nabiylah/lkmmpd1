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
public class Praktikum3 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        
        System.out.print("masukan kalimat1 : ");
        String kalimat1 = masukan.nextLine();
        System.out.print("masukan kalimat2 : ");
        String kalimat2 = masukan.nextLine();
       
        System.out.println("---------------------------------------------------");
        System.out.println("\"" + kalimat1 + "\"" + "\n\"" + kalimat2 + "\"" + " ucapnya");
    }
}
