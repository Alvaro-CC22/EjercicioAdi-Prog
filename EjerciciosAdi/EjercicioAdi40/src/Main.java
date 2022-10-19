import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int n = sc.nextInt();
        int divisores = 0;

        for(int contador = 1; contador <= n; ++contador) {
            if (n % contador == 0) {
                ++divisores;
            }
        }

        if (divisores == 2) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}