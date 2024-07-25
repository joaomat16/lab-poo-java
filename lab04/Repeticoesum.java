package lab04;

import java.util.Scanner;

public class Repeticoesum {
    
    public static void main(String[] args){

        var sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        var numero =sc.nextInt();
        var contador = 1;
        while (contador < 10){
            System.out.println(numero * contador);
            contador += 1;
        }
    }
}