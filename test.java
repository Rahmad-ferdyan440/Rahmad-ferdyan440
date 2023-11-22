import java.util.Scanner;

public class test {
    // Deklarasi array untuk menyimpan nilai mahasiswa
    static int[][] nilaiMhs = new int[5][7];

    

    // Fungsi untuk meninputkan data nilai mahasiswa
    static void inputNilaiMhs(int[][]nilaiMhs) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan nilai mahasiswa " + (i + 1) + " (minggu 1 sampai 7): ");
            for (int j = 0; j < 7; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMhs[i][j] = scanner.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa
    static void tampilkanNilaiMhs(int[][] nilaiMhs) {
        System.out.println("Nilai Mahasiswa:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(nilaiMhs[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari pada hari keberapakah terdapat nilai tertinggi dibanding hari lain
    static int cariHariTertinggi() {
        int hariTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int j = 0; j < 7; j++) {
            int nilaiMinggu = 0;
            for (int i = 0; i < 5; i++) {
                nilaiMinggu += nilaiMhs[i][j];
            }

            if (nilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = nilaiMinggu;
                hariTertinggi = j + 1;
            }
        }

        return hariTertinggi;
    }

    // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi pada suatu minggu
    static void tampilkanMahasiswaTertinggi(int minggu) {
        System.out.println("Mahasiswa dengan nilai tertinggi pada minggu ke-" + minggu + ":");
        for (int i = 0; i < 5; i++) {
            if (nilaiMhs[i][minggu - 1] == nilaiMaksimal(minggu)) {
                System.out.println("Mahasiswa " + (i + 1) + " - Nilai: " + nilaiMhs[i][minggu - 1]);
            }
        }
    }

    // Fungsi untuk mencari nilai tertinggi pada suatu minggu
    static int nilaiMaksimal(int minggu) {
        int maksimal = nilaiMhs[0][minggu - 1];
        for (int i = 1; i < 5; i++) {
            if (nilaiMhs[i][minggu - 1] > maksimal) {
                maksimal = nilaiMhs[i][minggu - 1];
            }
        }
        return maksimal;
    }

    public static void main(String[] args) {
        inputNilaiMhs(nilaiMhs);
        tampilkanNilaiMhs(nilaiMhs);
        int hariTertinggi = cariHariTertinggi();
        System.out.println("Nilai tertinggi terdapat pada hari ke-" + hariTertinggi);
        tampilkanMahasiswaTertinggi(hariTertinggi);
    }
}
