public class DosenMain16 {
    public static void main(String[] args) {
        int tahunSekarang = 2026; 

        Dosen16 dsn1 = new Dosen16();
        dsn1.idDosen = "D001";
        dsn1.nama = "Bapak Budi, M.Kom";
        dsn1.statusAktif = false;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Jaringan Komputer";

        System.out.println("=== DATA DOSEN 1 ===");
        dsn1.tampilInformasi();
        dsn1.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(tahunSekarang) + " tahun");
        dsn1.ubahKeahlian("Keamanan Siber");

        System.out.println();

        Dosen16 dsn2 = new Dosen16("D002", "Ibu Siti, M.T", true, 2010, "Rekayasa Perangkat Lunak");
        
        System.out.println("=== DATA DOSEN 2 ===");
        dsn2.tampilInformasi();
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(tahunSekarang) + " tahun");
        dsn2.setStatusAktif(false);
    }
}