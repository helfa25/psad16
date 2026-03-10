package minggu5;

import java.util.Scanner;

public class MainSum16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan: ");
        int elemen = input.nextInt();

        Sum16 sm = new Sum16(elemen);

        for(int i = 0; i < elemen; i++){
            System.out.print("Masukkan keuntungan bulan ke-" + (i+1) + " : ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan (Brute Force): " + sm.totalBF());
        System.out.println("Total keuntungan (Divide Conquer): " + sm.totalDC(sm.keuntungan, 0, elemen-1));

    }

}