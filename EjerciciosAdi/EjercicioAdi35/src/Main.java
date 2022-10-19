import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Introduzca la nota: ");

        for(nota = sc.nextDouble(); nota < 0 || nota > 10; nota = sc.nextDouble()) {
            System.out.println("Introduce una nota válida.");
        }

        if (nota < 5.0) {
            System.out.println("Suspenso");
        } else if (nota > 5.0 && nota < 6.0) {
            System.out.println("Suficiente");
        } else if (nota > 6.0 && nota < 7.0) {
            System.out.println("Bien");
        } else if (nota > 7.0 && nota < 9.0) {
            System.out.println("Notable");
        } else if (nota > 9.0 && nota < 10.0) {
            System.out.println("Sobresaliente");
        }
    }
}