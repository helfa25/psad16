package minggu5;

import java.util.Scanner;

public class MainFaktorial16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial16 fk = new Faktorial16();

        System.out.println("Nilai faktorial BF : " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial DC : " + fk.faktorialDC(nilai));

    }

}