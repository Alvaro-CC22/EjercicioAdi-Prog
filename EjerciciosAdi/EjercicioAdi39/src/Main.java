import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int n1 = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        int n2 = sc.nextInt();

        for(int contador = n1; contador <= n1 * n2; ++contador) {
            if (contador % n1 == 0 && contador % n2 == 0) {
                System.out.println(contador);
                contador = n1 * n2;
            }
        }
    }
}