package lab04;

import java.util.Scanner;

public class Repeticoesquatro {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        var numero = sc.nextInt();

        for (int i = 0; 1 < 10; i++) {
            System.out.print(numero + " x " + i + " = ");
            System.out.println(i * numero);
        }
    }
}
