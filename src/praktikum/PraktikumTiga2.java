package praktikum;
import java.util.Scanner;

public class PraktikumTiga2 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        double beratLaptop = 850.56;
        double beratBuku = 250.11;
        double beratKotak = 25.31;
        double beratHp = 200.00;
        
        System.out.print("masukan jumlah laptop : ");
        double laptop = masukan.nextDouble();
         
        System.out.print("masukan jumlah buku : ");
        double buku = masukan.nextDouble();
        
        System.out.print("masukan jumlah kotak : ");
        double kotak = masukan.nextDouble();
        
        System.out.print("masukan jumlah hp : ");
        double hp = masukan.nextDouble();
        
        if (buku <0 || laptop <0 || kotak <0 || hp <0) {
            System.out.println("ERROR - Tidak diperkenankan bilangan negatif!");
        }
        
        double totalLaptop = beratLaptop * laptop;
        double totalBuku = beratBuku * buku;
        double totalKotak = beratKotak * kotak;
        double totalHp = beratHp * hp;
        
        double totalBerat = totalLaptop+totalBuku+totalKotak+totalHp;
        
        int indeks;
        if ( totalBerat > 2000 ) {
            indeks= 5;
        } else if ( totalBerat >=1500 && totalBerat <=2000 ) {
            indeks= 4; 
        } else if ( totalBerat >=1000 && totalBerat <1500) {
            indeks= 3;
        } else if ( totalBerat >= 500 && totalBerat <1000 ) {
            indeks= 2;
        } else if ( totalBerat >0 && totalBerat <500 ) {
            indeks= 1;
        } else  { 
            indeks= 0;
        }
        
        if (indeks >= 1 && indeks <=5) {
            System.out.println("indeks = " + indeks);
        }
        
        if ( indeks >= 5 ) {
            System.out.println("Berat barang melebihi ketentuan");
        } else if ( indeks >= 1 && indeks < 5 ) {
            System.out.println("Bawaan barang tidak melebihi ketentuan, aman masbro");
        }
                
       }     
    }
