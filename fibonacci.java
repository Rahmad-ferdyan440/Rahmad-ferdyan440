public class fibonacci {
    public static void main(String[] args) {
        int n = 10; // Contoh input
        int a = 0, b = 1;
        int result = 0;

       
        if (n == 1)
            result = b;
        else {
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
        }
        System.out.println("Hasil deret Fibonacci ke-" + n + " adalah: " + result);
    }
}

