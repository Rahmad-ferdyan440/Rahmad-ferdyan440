import java.util.Scanner;
public class anothertest {
    
    static String tulisPesan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tulisan: ");
        String tulis = sc.nextLine();
        return tulis;
    }

    static void cetakPesan(){
        String pesan = tulisPesan();
        System.out.println(pesan);
    }

    public static void main(String[] args) {
        cetakPesan();
    }
}