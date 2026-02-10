public class fungsi {

    static int[][] stockBunga = {
            { 10, 5, 15, 7 }, // RoyalGarden 1
            { 6, 11, 9, 12 }, // RoyalGarden 2
            { 2, 10, 10, 5 }, // RoyalGarden 3
            { 5, 7, 12, 9 } // RoyalGarden 4
    };

    static int[] hargaBunga = { 75000, 50000, 60000, 10000 };

    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("   DATA STOK BUNGA ROYAL GARDEN");
        System.out.println("============================================");
        tampilkanStock();

        System.out.println("\n============================================");
        System.out.println("   PENDAPATAN & STATUS SETIAP CABANG");
        System.out.println("============================================");
        cekPendapatanDanStatus();
    }

    static void tampilkanStock() {
        String[] namaBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };

        System.out.printf("%-15s", "Cabang");
        for (String nama : namaBunga) {
            System.out.printf("%-12s", nama);
        }
        System.out.println();

        for (int i = 0; i < stockBunga.length; i++) {
            System.out.printf("%-15s", "RoyalGarden " + (i + 1));
            for (int j = 0; j < stockBunga[i].length; j++) {
                System.out.printf("%-12d", stockBunga[i][j]);
            }
            System.out.println();
        }
    }

    static void cekPendapatanDanStatus() {
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;


            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += (stockBunga[i][j] * hargaBunga[j]);
            }

            System.out.print("RoyalGarden " + (i + 1) + " : Rp " + totalPendapatan);

            if (totalPendapatan > 1500000) {
                System.out.println(" -> Status: Sangat Baik");
            } else {
                System.out.println(" -> Status: Perlu Evaluasi");
            }
        }
    }
}