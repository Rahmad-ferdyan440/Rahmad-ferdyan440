import java.util.Scanner;
public class testnested {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah buku: ");
    int jmlBuku = input.nextInt();
    input.nextLine();
    String identitas[] = {"Nama Buku", "Penulis", "Tahun Terbit"};
    String[][] buku = new String [jmlBuku][3];

        for (int i = 0; i < buku.length; i++) {
            System.out.println("\nMasukkan informasi buku ke-" + (i+1) + ":");
            for (int j = 0; j < buku[i].length; j++) {
                System.out.print( (identitas[j]) + ": ");
                buku[i][j] = input.nextLine();
            }
        }

        System.out.println("\nINFORMASI BUKU:");
        for (int i = 0; i < buku.length; i++) {
            System.out.println("\nBuku ke-" + (i+1) + ":");
            for (int j = 0; j < buku[i].length; j++) {
                System.out.println(" >" + (identitas[j]) + "\t: "  + buku[i][j]);
            }
        }
    }
}
