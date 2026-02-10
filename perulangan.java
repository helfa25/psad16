import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PROGRAM PERULANGAN (DERET NIM) ===");
        System.out.print("Masukkan NIM Anda: ");

        String nim = sc.nextLine().trim();

        if (nim.length() < 2) {
            System.out.println("ERROR: NIM harus minimal 2 digit!");
            return; 
        }

        String duaDigit = nim.substring(nim.length() - 2);
        int n = Integer.parseInt(duaDigit);

        System.out.println(">> 2 Digit Terakhir: " + n);

        if (n < 10) {
            n += 10;
            System.out.println(">> Karena n < 10, n diubah menjadi: " + n);
        } else {
            System.out.println(">> Nilai n tetap: " + n);
        }

        System.out.println("----------------------------------------");
        System.out.print("OUTPUT DERET : ");

        for (int i = 1; i <= n; i++) {

            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("# ");
            }
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            else {
                System.out.print("* ");
            }
        }

        System.out.println("\n----------------------------------------");
    }
}