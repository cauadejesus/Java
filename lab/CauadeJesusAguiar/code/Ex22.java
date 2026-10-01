package lab.CauadeJesusAguiar.code;
import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma tempetatura em Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * (9 / 5)) + 32;
        
        System.out.printf("%.2f °C equivale a %.1f °F", celsius, fahrenheit);
        sc.close();
    }
}
