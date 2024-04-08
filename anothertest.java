import java.util.Scanner;
public class anothertest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int jml = sc.nextInt();

        for (int i=0; i<jml; i++){
            for (int j=jml-i; j<=jml; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
// 0 = 1; 1=2; 2=3; 3=4; 4=5