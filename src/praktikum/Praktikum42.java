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
public class Praktikum42 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        double pi = 3.141592;
        
        System.out.print("masukan r : ");
        double r = masukan.nextDouble();
        
        double luas = pi*r*r;
        
        System.out.println("luas : " + Math.round(luas));
        
    }
    
}
