
package praktikum;
import java.util.Scanner;

public class PraktikumTiga {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("nilai = ");
        int nilai = masukan.nextInt();
        if (nilai % 5 == 0 && nilai % 2 != 0) {
            System.out.println("Program Started");
        } else {
            System.out.println("Program Halted");
        }
    }
 
}
