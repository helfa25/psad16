import java.util.Scanner;

class MenuItem16 {
    public String namaMenu;
    public double harga;
    public String kategori;

    public MenuItem16(String namaMenu, double harga, String kategori) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    public String tampilkanInfo(String pesan) {
        String info = "===== " + pesan + " =====\n" +
                      "Nama Menu  : " + namaMenu + "\n" +
                      "Harga      : Rp " + harga + "\n" +
                      "Kategori   : " + kategori + "\n";
        return info;
    }

    public double hitungDiskon(String kategoriInput) {
        if (kategoriInput.equalsIgnoreCase("Makanan")) {
            return 0.10;
        } else if (kategoriInput.equalsIgnoreCase("Minuman")) {
            return 0.15;
        } else if (kategoriInput.equalsIgnoreCase("Dessert")) {
            return 0.20;
        }
        return 0.05;
    }

    public double hitungTotal(int quantity, double pajak) {
        double subtotal = harga * quantity;
        double totalPajak = subtotal * pajak;
        return subtotal + totalPajak;
    }

    public double hitungPembayaran(String namaPemesan, int quantity) {
        String info = tampilkanInfo("PESANAN " + namaPemesan);
        System.out.print(info);

        double diskon = hitungDiskon(kategori);
        System.out.println("Diskon      : " + (diskon * 100) + "%");

        double subtotal = hitungTotal(quantity, 0.10);
        double totalDiskon = subtotal * diskon;
        double totalPembayaran = subtotal - totalDiskon;

        System.out.println("Quantity    : " + quantity);
        System.out.println("Subtotal    : Rp " + subtotal);
        System.out.println("Total Diskon: Rp " + totalDiskon);
        System.out.println("Total Bayar : Rp " + totalPembayaran);
        System.out.println("========================================");

        return totalPembayaran;
    }
}

public class kuis1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MenuItem16[] arrayMenu = new MenuItem16[3];
        int[] jumlahPesanan = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\n===== INPUT DATA MENU " + (i + 1) + " =====");
            System.out.print("Nama Menu   : ");
            String nama = input.nextLine();
            System.out.print("Harga (Rp)  : ");
            double harga = input.nextDouble();
            input.nextLine();
            System.out.print("Kategori    : ");
            String kategori = input.nextLine();

            arrayMenu[i] = new MenuItem16(nama, harga, kategori);
        }

        System.out.println("\n========== INPUT JUMLAH PESANAN ==========");
        for (int i = 0; i < 3; i++) {
            System.out.print("Jumlah pesan untuk " + arrayMenu[i].namaMenu + " : ");
            jumlahPesanan[i] = input.nextInt();
        }

        System.out.println("\n\n========== DAFTAR MENU CAFE ==========");
        System.out.println("========================================");

        double totalKeseluruhan = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("\n--------- Menu ke-" + (i + 1) + " ---------");
            double pembayaran = arrayMenu[i].hitungPembayaran("Pelanggan", jumlahPesanan[i]);
            totalKeseluruhan += pembayaran;
        }

        System.out.println("\n===== TOTAL PEMBAYARAN =====");
        System.out.println("Total Keseluruhan: Rp " + totalKeseluruhan);
        System.out.println("========================================");

        input.close();
    }
}
