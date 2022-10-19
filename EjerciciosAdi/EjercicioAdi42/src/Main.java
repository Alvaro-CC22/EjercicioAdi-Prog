import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int x = r.nextInt(100);
        System.out.println("Intenta adivinar el número del 0 al 100");
        int n = sc.nextInt();

        int intentos;
        for(intentos = 0; n != x; n = sc.nextInt()) {
            System.out.println("Número incorrecto");
            if (n > x) {
                System.out.println("Prueba uno menor");
            } else {
                System.out.println("Prueba uno mayor");
            }

            ++intentos;
        }

        System.out.println("Acertaste, el número era " + x + ", has hecho " + intentos + " intentos.");
    }
}