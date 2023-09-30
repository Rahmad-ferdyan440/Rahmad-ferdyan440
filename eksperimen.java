import java.util.Scanner;
public class eksperimen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;
        float alfa, jamPelajaran;
        float uas, uts, kuis, kompen, ipk;
        char ulangi;

    do{
        System.out.println("=== DAFTAR MENU ===");
        System.out.println("1. Cek IPK");
        System.out.println("2. Denda kompen");
        System.out.print("\nMasukkan nomor pilihan Anda: ");
        menu=input.nextInt();

        switch(menu){
            case 1:
            System.out.println("\n== CEK IPK ==");
            System.out.println("Masukkan nilai rerata Kuis: ");
            kuis=input.nextFloat();
            System.out.println("Masukkan nilai UTS: ");
            uts=input.nextFloat();
            System.out.println("Masukkan nilai UAS: ");
            uas=input.nextFloat();
            
            ipk=((uts*0.6F)+(uas)+(kuis*0.4F))/50F;
            System.out.println("\n>>> Hasil IPK Anda: " +ipk+ " <<<");

            break;
            case 2:
            System.out.println("\n== DENDA KOMPEN ==");
            System.out.println("Masukkan jumlah jam alpha: ");
            alfa=input.nextFloat();

            jamPelajaran=alfa*50;
            kompen=jamPelajaran*0.75F;

            System.out.println("\nJumlah jam pelajaran alpha Anda (dalam menit): " +jamPelajaran+ " menit");
            System.out.println("Waktu kompen yang harus Anda bayar adalah: >>> " +kompen+ " menit <<<");
            break;
            }

            System.out.print("\nIngin memilih menu lain? ");
            System.out.println("(Ketik y : untuk yes/ n : untuk no)");
            ulangi=input.next().charAt(0);
            System.out.println();
      }

    while (ulangi != 'n');

    System.out.println("Terima kasih sudah menggunakan layanan ini!");
    System.out.println();

 }
}