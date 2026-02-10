import java.util.Scanner;
import java.util.ArrayList;

public class IPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   Program Menghitung IP Semester");
        System.out.println("================================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        ArrayList<String> matkul = new ArrayList<>();
        ArrayList<Integer> sks = new ArrayList<>();
        ArrayList<Double> nilaiAngka = new ArrayList<>();
        ArrayList<String> nilaiHuruf = new ArrayList<>();
        ArrayList<Double> bobotNilai = new ArrayList<>();

        
        System.out.println("\n--- Masukkan Data Mata Kuliah ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Mata Kuliah ke-" + (i+1) + ":");
            System.out.print("Nama mata kuliah: ");
            matkul.add(sc.nextLine());
            System.out.print("SKS: ");
            sks.add(sc.nextInt());
            System.out.print("Nilai angka: ");
            nilaiAngka.add(sc.nextDouble());
            sc.nextLine(); // consume newline
        }
       
        double totalBobotSKS = 0;
        int totalSKS = 0;

        for (int i = 0; i < matkul.size(); i++) {
            double nilai = nilaiAngka.get(i);
            if (nilai > 80 && nilai <= 100) {
                nilaiHuruf.add("A");
                bobotNilai.add(4.00);
            } else if (nilai > 73 && nilai <= 80) {
                nilaiHuruf.add("B+");
                bobotNilai.add(3.50);
            } else if (nilai > 65 && nilai <= 73) {
                nilaiHuruf.add("B");
                bobotNilai.add(3.00);
            } else if (nilai > 60 && nilai <= 65) {
                nilaiHuruf.add("C+");
                bobotNilai.add(2.50);
            } else if (nilai > 50 && nilai <= 60) {
                nilaiHuruf.add("C");
                bobotNilai.add(2.00);
            } else if (nilai > 39 && nilai <= 50) {
                nilaiHuruf.add("D");
                bobotNilai.add(1.00);
            } else {
                nilaiHuruf.add("E");
                bobotNilai.add(0.00);
            }

            totalBobotSKS += (bobotNilai.get(i) * sks.get(i));
            totalSKS += sks.get(i);
        }

        double ipSemester = totalBobotSKS / totalSKS;

        System.out.println("\n==================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==================================");

        System.out.printf("%-40s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < matkul.size(); i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                matkul.get(i), nilaiAngka.get(i), nilaiHuruf.get(i), bobotNilai.get(i));
        }
        
        System.out.println("==================================");
        System.out.printf("IP Semester : %.2f\n", ipSemester);
        System.out.println("==================================");
    }
}