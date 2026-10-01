package lab.CauadeJesusAguiar.code;
import java.util.Scanner;
public class Ex23 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a nota 1: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o peso 1: ");
        double p1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite o peso 2: ");
        double p2 = sc.nextDouble();
        System.out.println("Digite a nota 3: ");
        double n3 = sc.nextDouble();
        System.out.println("Digite o peso 3: ");
        double p3 = sc.nextDouble();
        
        double media = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);
        System.out.printf("\nMédia ponderada: %.2f", media);
        sc.close();
    }
}
