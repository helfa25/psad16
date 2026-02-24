public class Dosen16 {
    public String idDosen;
    public String nama;
    public boolean statusAktif; // true = aktif, false = tidak aktif
    public int tahunBergabung;
    public String bidangKeahlian;

    public Dosen16() {
    }

    public Dosen16(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen         : " + idDosen);
        System.out.println("Nama Dosen       : " + nama);
        System.out.println("Status Aktif     : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung  : " + tahunBergabung);
        System.out.println("Bidang Keahlian  : " + bidangKeahlian);
    }

    public void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status dosen telah diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
    }
}