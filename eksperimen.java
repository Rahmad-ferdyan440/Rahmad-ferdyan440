import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class eksperimen {

    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int number = random.nextInt(50)+1;
        int kr=0, kn=50;
        boolean success = false;

System.out.println("PERMAINAN ANGKA BOM!");
System.out.println("Jangan sampai pilih angka BOM!");
System.out.println("===============================");

        do{
            System.out.print("Tebak angka (1-50): ");
            int answer = input.nextInt();
            input.nextLine();
            success = (answer == number);

            if (answer > number){
                kn=answer;
                System.out.println("  >>Antara " +kr+ " - " + kn);
            } else if (answer < number){ 
                kr=answer;
                System.out.println("  >>Antara " +kr+ " - " + kn);
            } 
            
        } while (!success);{
            System.out.println();
            System.out.println("**** BOOOMMM!!! ****");
            System.out.println("## ANGKA BOM nya adalah " + number + " !!!");
        }
            
    }
}