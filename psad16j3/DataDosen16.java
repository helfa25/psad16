public class DataDosen16 {

    public static void dataSemuaDosen(Dosen16[] arrayOfDosen) {
        System.out.println("=== DATA SEMUA DOSEN ===");
        int i = 1;
        for (Dosen16 dsn : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i++);
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("--------------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen16[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen16 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
        System.out.println("--------------------------------");
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen16[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen16 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                totalUsiaPria += dsn.usia;
                countPria++;
            } else {
                totalUsiaWanita += dsn.usia;
                countWanita++;
            }
        }

        System.out.println("=== RATA-RATA USIA DOSEN ===");
        if (countPria > 0) {
            System.out.println("Pria   : " + ((double) totalUsiaPria / countPria));
        } else {
            System.out.println("Pria   : Tidak ada data");
        }
        
        if (countWanita > 0) {
            System.out.println("Wanita : " + ((double) totalUsiaWanita / countWanita));
        } else {
            System.out.println("Wanita : Tidak ada data");
        }
        System.out.println("--------------------------------");
    }

    public static void infoDosenPalingTua(Dosen16[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen16 tertua = arrayOfDosen[0];

        for (Dosen16 dsn : arrayOfDosen) {
            if (dsn.usia > tertua.usia) {
                tertua = dsn;
            }
        }
        System.out.println("=== DOSEN PALING TUA ===");
        System.out.println("Kode          : " + tertua.kode);
        System.out.println("Nama          : " + tertua.nama);
        System.out.println("Jenis Kelamin : " + (tertua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + tertua.usia);
        System.out.println("--------------------------------");
    }

    public static void infoDosenPalingMuda(Dosen16[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen16 termuda = arrayOfDosen[0];

        for (Dosen16 dsn : arrayOfDosen) {
            if (dsn.usia < termuda.usia) {
                termuda = dsn;
            }
        }
        System.out.println("=== DOSEN PALING MUDA ===");
        System.out.println("Kode          : " + termuda.kode);
        System.out.println("Nama          : " + termuda.nama);
        System.out.println("Jenis Kelamin : " + (termuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + termuda.usia);
        System.out.println("--------------------------------");
    }
}