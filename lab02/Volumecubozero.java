import java.util.Scanner;

public class Volumecubozero{
    public static void main(String[] args){
        Scanner cubo = new Scanner(System.in);
        System.out.println("Insira a medição da aresta do cubo. ");
        double aresta = cubo.nextDouble();
        double volume = Math.pow(aresta, 3);
        if (aresta <= 0) {
            System.out.println("Não é possível calcular.");
        } else {
            System.out.println("O volume do cubo é: " + volume);
        }
    }
}