package minggu5;

public class NilaiMahasiswa16 {

    int uts[];
    int uas[];
    int jumlah;

    NilaiMahasiswa16(int jumlah){
        this.jumlah = jumlah;
        uts = new int[jumlah];
        uas = new int[jumlah];
    }

    int maxUTS(int l, int r){

        if(l == r){
            return uts[l];
        }

        int mid = (l + r) / 2;

        int lmax = maxUTS(l, mid);
        int rmax = maxUTS(mid+1, r);

        if(lmax > rmax){
            return lmax;
        }else{
            return rmax;
        }
    }

    int minUTS(int l, int r){

        if(l == r){
            return uts[l];
        }

        int mid = (l + r) / 2;

        int lmin = minUTS(l, mid);
        int rmin = minUTS(mid+1, r);

        if(lmin < rmin){
            return lmin;
        }else{
            return rmin;
        }
    }

    double rataUAS(){

        int total = 0;

        for(int i = 0; i < jumlah; i++){
            total += uas[i];
        }

        return (double) total / jumlah;
    }

}