public class mahasiswademo16 {
    public static void main(String[] args) {
        mahasiswaberprestasi16 list = new mahasiswaberprestasi16();

        mahasiswa16 m1 = new mahasiswa16("123", "Zidan", "2A", 3.2);
        mahasiswa16 m2 = new mahasiswa16("124", "Ayu", "2A", 3.5);
        mahasiswa16 m3 = new mahasiswa16("125", "Sofi", "2A", 3.1);
        mahasiswa16 m4 = new mahasiswa16("126", "Sita", "2A", 3.9);
        mahasiswa16 m5 = new mahasiswa16("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
        
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();
        
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}