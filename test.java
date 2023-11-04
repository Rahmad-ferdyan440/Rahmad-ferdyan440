import java.util.Scanner;
public class test {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int diameter, tinggi, menu, pilihPi;
    char repeat;
    double phi, othPi;
    float luas, keliling, luasPer, volume;

    do{
    System.out.println("");
    System.out.println("KALKULATOR");
    System.out.println("== PILIH MENU ==");
    System.out.println("1. Lingkaran (Luas & Keliling)");
    System.out.println("2. Tabung (Volume dan Luas Permukaan)");
    System.out.print("\t>>Masukkan pilihan menu: ");
    menu = sc.nextInt();

        switch(menu){

        case 1:
        System.out.print("\nMasukkan diameter: ");
        diameter = sc.nextInt();
        diameter/=2;
        System.out.println("\nPilih nilai \u03C0 ! ");
        System.out.println("1. \u03C0 = 3.14");
        System.out.println("2. \u03C0 = 22/7");
        System.out.print("\t>>Masukkan pilihan \u03C0: ");
        pilihPi = sc.nextInt();

            if (pilihPi==1){
                phi=3.14; othPi=1;
            } else {
                phi=22; othPi=7;
            }

        luas=(float) ((phi*(diameter)*(diameter))/othPi);
        keliling = (float) ((2*phi*diameter)/othPi);
        
        System.out.printf("\n|| Keliling = %.2f cm\t||", keliling);
        System.out.printf("\n|| Luas = %.2f cm\t||", luas);
        System.out.println("");
        break;

        case 2: 
        System.out.println("\n======");
        System.out.println("!! coba lagi kpn2 y, msh blm dibikin (males bgt) !!");
        break;

        default:
        System.out.println("\n======");
        System.out.println("!! Pilihannya kan 1 atau 2 doang anjg !!");
        break;

        }

        System.out.print("\nCoba yang lain? (y/n): ");
        repeat = sc.next().charAt(0);

    } while (repeat == 'y');

    }
}
