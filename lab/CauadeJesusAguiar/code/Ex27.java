package lab.CauadeJesusAguiar.code;
import java.util.Scanner;
public class Ex27 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro de dois dígitos: ");
        int numero = sc.nextInt();
        
        int dezena = numero / 10;
        int unidade = numero % 10;
        int invertido = (unidade * 10) + dezena;
        
        System.out.println("Número invertido: " + invertido);
        sc.close();
    }
}
