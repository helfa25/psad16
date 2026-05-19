import java.util.Scanner;

public class Khohar_CM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLAntrian queue = new DLLAntrian();
        DLLPesanan orders = new DLLPesanan();

        // Inisialisasi: masukkan “nomor 3” ke antrian prioritas
        queue.enqueue(new Pembeli("Ainra", "08224500000"), 1, false);
        queue.enqueue(new Pembeli("Danra", "08224511111"), 2, false);
        queue.enqueue(new Pembeli("Sanri", "08224522222"), 3, true);
        int noAntrianCounter = 4;

        
        Pembeli[] dataPembeli = {
            new Pembeli("Vania", "08422234556")
        };
        int idxPembeli = 0;
        
        Pesanan[] dataPesanan = {
            new Pesanan(123, "Es Teler", 5000),
            new Pesanan(125, "Es Degan", 6000),
            new Pesanan(124, "Mie Goreng", 34000)
        };
        int idxPesanan = 0;
        
        while (true) {
            System.out.println("======================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("======================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            
            int menu = sc.nextInt();
            
            if (menu == 1) {
                if (idxPembeli < dataPembeli.length) {
                    Pembeli p = dataPembeli[idxPembeli++];
                    System.out.println("Nama Pembeli : " + p.namaPembeli);
                    System.out.println("No HP        : " + p.NoHp);
                    System.out.print("Jenis antrian (1=Prioritas, 0=Normal) : ");
                    int jenis = sc.nextInt();
                    boolean prioritasInput = (jenis == 1);

                    queue.enqueueDenganAturan(p, noAntrianCounter, prioritasInput);

                    // info label prioritas (berdasarkan aturan: normal hanya jadi prioritas jika normalSaatIni > 5)
                    boolean prioritasFinal = prioritasInput; // minimal sama dengan input
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + noAntrianCounter + (prioritasFinal ? " (Prioritas)" : ""));
                    noAntrianCounter++;

                }
                
            } else if (menu == 2) {
                System.out.println("======================================");
                System.out.println("Daftar Antrian Pembeli");
                System.out.println("======================================");
                queue.print();
                
            } else if (menu == 3) {
                NodeAntrian removed = queue.dequeue(); // prioritas dulu, lalu normal
                if (removed != null) {
                    if (idxPesanan < dataPesanan.length) {
                        Pesanan pesanan = dataPesanan[idxPesanan++];
                        System.out.println("Kode Pesanan: " + pesanan.kodePesanan);
                        System.out.println("Nama Pesanan: " + pesanan.namaPesanan);
                        System.out.println("Harga       : " + pesanan.harga);
                        
                        orders.add(pesanan);
                        System.out.println(removed.data.namaPembeli + " telah memesan " + pesanan.namaPesanan);
                    }
                }
                
            } else if (menu == 4) {
                System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
                orders.sortByName();
                orders.print();
                
            } else if (menu == 0) {
                break;
            }
        }
        sc.close();
    }
}