package lab.CauadeJesusAguiar.code;
import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159; // Constante em Java usa a palavra 'final'
        
    System.out.println("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        double area = PI * raio * raio; // ou Math.pow(raio,2)
        
        System.out.printf("Área do círculo: %.4f", area);
        sc.close();
    }
}
