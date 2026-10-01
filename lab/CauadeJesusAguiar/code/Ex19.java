package lab.CauadeJesusAguiar.code;
import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        
        int idadeAproximada = anoAtual - anoNascimento;
        System.out.println("Idade aproximada: " + idadeAproximada + " anos");
        
        sc.close();
    }
}
