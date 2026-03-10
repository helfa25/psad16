package minggu5;

import java.util.Scanner;

public class MainNilaiMahasiswa16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();

        NilaiMahasiswa16 nm = new NilaiMahasiswa16(n);

        for(int i = 0; i < n; i++){

            System.out.println("Mahasiswa ke-" + (i+1));

            System.out.print("Nilai UTS : ");
            nm.uts[i] = input.nextInt();

            System.out.print("Nilai UAS : ");
            nm.uas[i] = input.nextInt();
        }

        System.out.println("\nNilai UTS tertinggi : " + nm.maxUTS(0, n-1));
        System.out.println("Nilai UTS terendah : " + nm.minUTS(0, n-1));
        System.out.println("Rata-rata nilai UAS : " + nm.rataUAS());

    }

}