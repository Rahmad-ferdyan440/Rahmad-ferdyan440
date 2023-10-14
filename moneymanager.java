import java.util.Scanner;
public class moneymanager {
    
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int menu, pemasukkan=0, pengeluaran=0, saldo;
char konfirmasi;

do{
    System.out.println("=== DAFTAR MENU ===");
    System.out.print("1. Input Pemasukkan | ");
    System.out.print("2. Input Pengeluaran | ");
    System.out.println("3. Cek Saldo");
    System.out.print("\nMasukkan nomor pilihan Anda: ");
    menu=input.nextInt();

    switch(menu){
        case 1:
        System.out.println("=== PEMASUKKAN ===");
        System.out.println("Masukkan nominal pemasukkan: ");
        pemasukkan=input.nextInt();
        System.out.printf("Nominal sejumlah %d telah ditambahkan!\n", pemasukkan);
        break;
        case 2:
        System.out.println("=== PENGELUARAN ===");
        System.out.println("Masukkan nominal pengeluaran: ");
        pengeluaran=input.nextInt();
        System.out.printf("Nominal sejumlah %d telah ditarik!\n", pengeluaran);
        break;
        case 3:
        System.out.println("=== SALDO ===");
        saldo=pemasukkan-pengeluaran;
        System.out.println("Saldo anda tersisa = " + saldo);
        break;
        }

        System.out.print("\nIngin memilih menu lain (y/t)? ");
        konfirmasi=input.next().charAt(0);
        System.out.println();
  }

while (konfirmasi != 't');

System.out.println("\nTerima kasih!");

}
}
