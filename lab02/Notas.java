package lab02;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota >= 90 && nota <= 100) {
            System.out.println("Conceito A");
        } else if (nota >= 80 && nota < 90) {
            System.out.println("Conceito B");
        } else if (nota >= 70 && nota < 80) {
            System.out.println("Conceito C");
        } else if (nota >= 60 && nota < 70) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }

        scanner.close();
    }
}