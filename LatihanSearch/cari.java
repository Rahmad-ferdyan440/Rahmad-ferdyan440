package LatihanSearch;
import java.util.Scanner;
public class cari {
    binarysearch listBrg[] = new binarysearch[5];
    int idx;

    void tambah(binarysearch m) {
        if (idx < listBrg.length) {
            listBrg[idx] = m;
            idx++;
        } else {
            System.out.println("Penuh!");
        }
    }

    void tampil() {
        for (binarysearch m : listBrg) {
            m.tampilData();
        }
    }

    public int find(int cari, int left, int right){
        if (left <= right) {
            int mid = (left + right) / 2;
            
            if (cari == listBrg[mid].kode){
                return mid;
            } else if (listBrg[mid].kode > cari){
                return find(cari, left, mid -1);
            } else {
                return find (cari, mid + 1, right);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        cari data = new cari();
        int jumBrg = 5;

        System.out.println("Masukkan data barang!");
        for (int i = 0; i < jumBrg; i++) {
            
        }

    }
}




