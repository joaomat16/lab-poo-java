package lab04;

import java.util.Scanner;

public class Java {

    
    public static void main(String[] args){
        
        var sc = new Scanner(System.in);

        var sorteio = (int) Math.random() * 10;
        int tent = 0;

        while (true) {

            System.out.println("Digite um número: ");
            var numero =sc.nextInt();
            tent++;
            
            if (numero < sorteio){
                System.out.println("Maior que isso");
            }else if (numero > sorteio){
                System.out.println("Menor que isso");
            }else{
                System.out.println("Eba, você acertou com " + tent + " tentativas!!!");

                break;
            }

            
 
            
        }
    }
}
