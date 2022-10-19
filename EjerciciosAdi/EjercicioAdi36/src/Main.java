public class Main {
    public static void main(String[] args) {
        int contador = 1;

        for(int num = 0; num < 10; ++contador) {
            if (contador % 2 != 0 && contador % 3 != 0) {
                System.out.println(contador);
                ++num;
            }
        }
    }
}