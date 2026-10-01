package lab.CauadeJesusAguiar.code;
import java.util.Scanner;
public class Ex24 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do saque: ");
        int valorSaque = sc.nextInt();
        int qtdNotas = valorSaque / 50;
        int troco = valorSaque % 50;
        
        System.out.println("Quantidade de notas de R$50: " + qtdNotas);
        System.out.println("Valor do troco que sobra: R$ " + troco);
        sc.close();
    }
}