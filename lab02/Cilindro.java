import java.util.Scanner;

public class Cilindro{
    public static void main(String[] args){
        Scanner cilindro = new Scanner(System.in);
        System.out.println("Insira a medição do raio do cilindro. ");
        double raio = cilindro.nextDouble();
        System.out.println("Insira a medição da altura do cilindro. ");
        double altura = cilindro.nextDouble();
        double raioexponencial = Math.pow(raio, 3);
        double volume = 3.14 * raioexponencial * altura;
        System.out.println("O volume do cilindro é: " + volume);
    }
}