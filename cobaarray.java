import java.util.Scanner;
public class cobaarray {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int tanggalPinjam, bulanPinjam, tanggalBalik, bulanBalik, adjust, durasi;
    int[] bLn = new int [3];
    bLn[0]=31;
    bLn[1]=28;
    bLn[2]=30;

    System.out.println("=== DATA PEMINJAMAN ===");
    System.out.print("Masukkan tanggal: ");
    tanggalPinjam=sc.nextInt();
    System.out.print("Masukkan bulan : ");
    bulanPinjam=sc.nextInt();
    
    System.out.println("=== DATA PENGEMBALIAN ===");
    System.out.print("Masukkan tanggal: ");
    tanggalBalik=sc.nextInt();
    System.out.print("Masukkan bulan : ");
    bulanBalik=sc.nextInt();
    
    if (bulanPinjam == bulanBalik){
        durasi=tanggalBalik-tanggalPinjam;
        System.out.println("Durasi peminjaman buku Anda = "+durasi+ " hari");
    } else {
        for (int i=0; i<bLn.length; i++){
            if((i+1)==bulanPinjam){
                adjust=bLn[i]-tanggalPinjam;
                durasi=adjust+tanggalBalik;
                System.out.println("Durasi peminjaman buku Anda = "+durasi+ " hari");
            }
        }

    }
  }
}
