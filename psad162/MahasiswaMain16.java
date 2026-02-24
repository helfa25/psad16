public class MahasiswaMain16 {
    public static void main(String[] args) {
        Mahasiswa16 mhs1 = new Mahasiswa16();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        System.out.println("-------------------------");

        Mahasiswa16 mhs2 = new Mahasiswa16("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        System.out.println("-------------------------");

        Mahasiswa16 mhs16 = new Mahasiswa16("Nama Anda", "NIM Anda", 3.85, "TI 1A");
        mhs16.tampilkanInformasi();
    }
}