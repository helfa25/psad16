import java.util.Scanner;

public class DosenDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dummy, kode, nama, jkString;
        Boolean jenisKelamin;
        int usia;

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Dosen16[] arrayOfDosen = new Dosen16[jumlah];

        System.out.println();

        for(int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            jkString = sc.nextLine();
            if (jkString.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }
            
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            
            System.out.println("--------------------------------");

            arrayOfDosen[i] = new Dosen16(kode, nama, jenisKelamin, usia);
        }

        System.out.println();

        DataDosen16.dataSemuaDosen(arrayOfDosen);
        DataDosen16.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen16.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen16.infoDosenPalingTua(arrayOfDosen);
        DataDosen16.infoDosenPalingMuda(arrayOfDosen);
    }
}