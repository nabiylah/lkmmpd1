/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yourname;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Latihan11 {
    public static void main(String[] args) {
        Scanner kabisat = new Scanner(System.in);
        System.out.print("tahun : ");
        int tahun = kabisat.nextInt();
        if ( tahun % 4 == 0 ) {
            System.out.println("Tahun Kabisat");
        } else if ( tahun % 4 != 0 ) {
            System.out.println("\t\"" + "Bukan Tahun Kabisat" + "\"");
        }
        
    }
}
