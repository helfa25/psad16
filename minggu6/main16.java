import java.util.Scanner;

public class main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        datadosen16 list = new datadosen16();
        int menu;

        do {
            System.out.println("=================================");
            System.out.println("MENU MANAJEMEN DATA DOSEN");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda-Tertua dengan Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia Tertua-Termuda dengan Selection Sort)");
            System.out.println("5. Keluar");
            System.out.println("=================================");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkStr = sc.nextLine();
                    Boolean jk = jkStr.equalsIgnoreCase("L");
                    System.out.print("Masukkan Usia Dosen: ");
                    int usia = sc.nextInt();
                    
                    dosen16 d = new dosen16(kode, nama, jk, usia);
                    list.tambah(d);
                    break;
                case 2:
                    System.out.println("Data Seluruh Dosen:");
                    list.tampil();
                    break;
                case 3:
                    list.SortingASC();
                    System.out.println("Data berhasil diurutkan secara ASCENDING!");
                    break;
                case 4:
                    list.sortingDSC();
                    System.out.println("Data berhasil diurutkan secara DESCENDING!");
                    break;
                case 5:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (menu != 5);
        
        sc.close();
    }
}   