import java.util.Scanner;
public class test {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();

        for (int i=1; i<=baris; i++){
            for(int j=baris; j<baris; j--){
                System.out.print(" ");
            }
            for(int p=1; p<=i; p++){
                    System.out.print("* ");
                }
          System.out.println();
        }

    }
}