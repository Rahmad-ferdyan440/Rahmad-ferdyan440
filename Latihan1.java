//Membuat segitiga dengan simbol *//

import java.util.Scanner;
public class Latihan1 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int menu;
    int baris, jmL=0;
    char repeat;
    String s;

do{   
    int k=0;
    System.out.println("Pilih menu: ");
    System.out.println("1. Segitiga siku2");
    System.out.println("2. Segitiga piramida");
    System.out.print("Masukkan pilihan: ");
    menu = sc.nextInt();

    switch(menu){ 
    
    case 1:
        System.out.print("Masukkan jumlah baris: ");
        baris = sc.nextInt();

        for (int i=1; i<=baris; i++){
            System.out.println(" ");
            for(int j=1; j<=i; j++){
                System.out.print("*#");
            }
        }
        
        for (k=1; k<=baris; k++){
            jmL+=k;
        }
        System.out.println("");
        System.out.printf("\nJumlah bintang (*) = %d buah", jmL);
        break;

    case 2:
        System.out.print("Masukkan jumlah baris: ");
        baris = sc.nextInt();
        System.out.println();

        for (int i=1; i<=baris; i++){
            for(int j=1; j<=(baris-i); j++){
                System.out.print(" ");
            }
            for(int p=1; p<=i; p++){
                    System.out.print("* ");
                }
          System.out.println(" ");
        }
        
        for (k=1; k<=baris; k++){
            jmL+=k;
        }
        System.out.println("");
        System.out.printf("\nJumlah bintang (*) = %d buah", jmL);
        break;

    } 

System.out.print("\nPilih menu lain? (y/n): ");
repeat = sc.next().charAt(0);

} while (repeat == 'y');


}
}

