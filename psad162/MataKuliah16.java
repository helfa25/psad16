public class MataKuliah16 {
    public String kodeMK;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah16() {
    }

    public MataKuliah16(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    public void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah berhasil diubah menjadi: " + sks);
    }

    public void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jam berhasil ditambah. Total jam sekarang: " + jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Pengurangan berhasil. Sisa jam: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan, jumlah jam tidak mencukupi!");
        }
    }
}