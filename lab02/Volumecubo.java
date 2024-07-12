import java.util.Scanner;

public class Volumecubo{
    public static void main(String[] args){
        Scanner cubo = new Scanner(System.in);
        System.out.println("Insira a medição da aresta do cubo. ");
        double aresta = cubo.nextDouble();
        double volume = Math.pow(aresta, 3);
        System.out.println("O volume do cubo é: " + volume);
    }
}