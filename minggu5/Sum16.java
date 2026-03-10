package minggu5;

public class Sum16 {

    int elemen;
    double keuntungan[];

    Sum16(int elemen){
        this.elemen = elemen;
        keuntungan = new double[elemen];
    }

    double totalBF(){
        double total = 0;

        for(int i = 0; i < elemen; i++){
            total = total + keuntungan[i];
        }

        return total;
    }

    double totalDC(double arr[], int l, int r){

        if(l == r){
            return arr[l];
        }

        int mid = (l + r) / 2;

        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid + 1, r);

        return lsum + rsum;
    }

}