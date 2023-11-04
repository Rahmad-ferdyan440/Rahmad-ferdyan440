//Membuat segitiga siku-siku dengan simbol *//

import java.util.Scanner;
public class Latihan1 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int baris, jmL=0;

    System.out.print("Masukkan jumlah baris: ");
    baris = sc.nextInt();

    for (int i=1; i<=baris; i++){
        System.out.println(" ");
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
    }

    for (int k=1; k<=baris; k++){
        jmL+=k;
    }
    System.out.println("");
    System.out.printf("\nJumlah bintang (*) = %d buah", jmL);

    }
}
