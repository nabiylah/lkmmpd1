
package praktikum;
import java.util.Scanner;

public class PraktikumTiga4 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int semangka = 150;
        int harga = 100000;
        int pembelian, menit, diskon, stok;
        int potongan = (100000*5/100);
        
        System.out.print("jumlah pembelian = ");
         pembelian = masukan.nextInt();
        
        System.out.print("menit = ");
         menit = masukan.nextInt();
         
         stok = semangka-pembelian;
        
        if ( pembelian <= 0 || menit <= 0 ){
            System.out.println("ERROR - Inputan invalid");  
        } 
       
        if ( pembelian > 150 ) {
            System.out.println("Stok tidak mencukupi");
        }
        else if (pembelian > 0 && menit > 0 && menit <= 420 ){
            System.out.println("jumlah pembelian = " + pembelian);
            System.out.println("stok tersisa = " + stok);
        }
        if (menit >= 40 && pembelian > 0 && pembelian <= 150 && menit > 0 && menit <= 420 ) {
            diskon = (menit/40)*potongan;
        
        System.out.println("Hasil pembelian = " + (pembelian*harga-diskon));
        }
        else if (menit < 40 && menit > 0 && pembelian > 0 && pembelian <= 150) {
            System.out.println("Hasil pembelian : " + harga*pembelian);
}
         else if (menit > 420){
            System.out.println("Toko telah tutup");
        }
    }
}
        


