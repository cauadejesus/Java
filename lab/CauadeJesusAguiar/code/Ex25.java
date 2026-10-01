package lab.CauadeJesusAguiar.code;
import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        double temperatura = sc.nextDouble();
        
        boolean menorQueZero = temperatura < 0;
        boolean igualAZero = temperatura == 0;
        boolean maiorQueTrinta = temperatura > 30;
        
        System.out.println("Temperatura < 0: " + menorQueZero);
        System.out.println("Temperatura == 0: " + igualAZero);
        System.out.println("Temperatura > 30: " + maiorQueTrinta);
        sc.close();
    }
}