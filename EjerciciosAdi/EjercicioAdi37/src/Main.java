import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Opción 1: Múltiplos de 11");
        System.out.println("Opción 2: Múltiplos de 17");
        System.out.println("Opción 3: Múltiplos de 23");
        System.out.println("Introduzca una opción:");
        int opcion = sc.nextInt();
        if (opcion != 1 && opcion != 2 && opcion != 3) {
            System.out.println("Opción Incorrecta");
        } else {
            byte n;
            if (opcion == 1) {
                n = 11;
            } else if (opcion == 2) {
                n = 17;
            } else {
                n = 23;
            }

            for(int contador = n; contador <= 100; contador += n) {
                System.out.println(contador);
            }
        }
    }
}