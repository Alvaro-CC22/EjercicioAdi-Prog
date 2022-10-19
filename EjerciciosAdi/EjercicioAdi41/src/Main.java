public class Main {
    public static void main(String[] args) {
        for(int n = 2; n <= 1000; ++n) {
            int divisores = 0;

            for(int contador = 1; contador <= n; ++contador) {
                if (n % contador == 0) {
                    ++divisores;
                }
            }

            if (divisores == 2) {
                System.out.println(n);
            }
        }
    }
}