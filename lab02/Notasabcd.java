package lab02;
import java.util.Scanner;

public class Notasabcd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o conceito: ");
        String Estado = scanner.nextLine().toUpperCase();

        switch (Estado) {
            case "A":
                System.out.println("Sua nota foi entre 91-100");
            break;
            case "B":
                System.out.println("Sua nota foi entre 81-90");
            break;
            case "C":
                System.out.println("Sua nota foi entre 71-80");
            break;
             case "D":
                System.out.println("Sua nota foi entre 61-70");
            break;
                case "E":
                System.out.println("Sua nota foi entre 0-60");
                break;
        }
    

        scanner.close();
   }
}