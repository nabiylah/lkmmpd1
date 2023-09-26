package Yourname;
import java.util.Scanner;

public class Latihan12 {
    public static void main(String[] args) {
        Scanner masukan  = new Scanner(System.in);
        System.out.print("Apakah ada kartu member : ");
        String kartu = masukan.nextLine();
        System.out.print("Masukan total belanjaan : ");
        int belanjaan = masukan.nextInt();
        int diskon;
        
      if (kartu.equalsIgnoreCase("ya")) {
        if (belanjaan > 500000) {
            diskon = 50000;
        } else if (belanjaan > 100000) {
            diskon = 15000;
        } else {
            diskon = 0;
        }
     } else {
            if (belanjaan > 100000) {
                diskon = 5000;
            } else {
                diskon = 0;
            }
        }
       int bayar;
       bayar = belanjaan - diskon;
        System.out.println("Total bayar : Rp " + bayar);
            }
}