/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

/**
 *
 * @author USER
 */
public class PernyataanIfElseIf {
    public static void main(String[] args) {
        double skorUjian =100;
        char nilai;
        
        if (skorUjian > 100 || skorUjian < 0 ) {
            System.out.println("Nilai yang anda masukan salah");
        } else {
            if (skorUjian >= 90) {
            nilai = 'A';
        } else if (skorUjian >= 80) {
            nilai = 'B'; 
        } else if (skorUjian >= 70) {
            nilai = 'C';
        } else {
            nilai = 'D';
        }
        System.out.println("Nilai = " + nilai);
       }
   }
}

