import java.util.Scanner;

public class Volumeretangulo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a medição do comprimento do retângulo. ");
        double comprimento = sc.nextDouble();
        System.out.println("Insira a medição do largura do retângulo. ");
        double largura = sc.nextDouble();
        System.out.println("Insira a medição do altura do retângulo. ");
        double altura = sc.nextDouble();
        double volume = comprimento * largura *altura;
        System.out.println("O volume do retângulo é " + volume);
    }
}