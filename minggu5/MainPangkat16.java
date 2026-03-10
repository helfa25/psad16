package minggu5;

import java.util.Scanner;

public class MainPangkat16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat16[] png = new Pangkat16[elemen];

        for(int i = 0; i < elemen; i++){

            System.out.print("Masukkan nilai yang dipangkatkan: ");
            int nilai = input.nextInt();

            System.out.print("Masukkan nilai pangkat: ");
            int pangkat = input.nextInt();

            png[i] = new Pangkat16(nilai, pangkat);
        }

        System.out.println("Hasil Pangkat Brute Force");

        for(Pangkat16 p : png){
            System.out.println(p.nilai + "^" + p.pangkat +
                    " = " + p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("Hasil Pangkat Divide Conquer");

        for(Pangkat16 p : png){
            System.out.println(p.nilai + "^" + p.pangkat +
                    " = " + p.pangkatDC(p.nilai, p.pangkat));
        }

    }

}