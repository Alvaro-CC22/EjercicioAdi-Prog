import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int n1 = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        int n2 = sc.nextInt();

        for(int contador = n1; contador >= 1; --contador) {
            if (n1 % contador == 0 && n2 % contador == 0) {
                System.out.println(contador);
                contador = 1;
            }
        }
    }
}