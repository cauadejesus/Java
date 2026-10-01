import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========Tabuada==========");    
        while (true) {
            System.out.println("\nDigite um número inteiro positivo ou 0 para sair: ");
            int num = sc.nextInt();

            if (num==0) {
                System.out.println("==========Programa encerrado========== ");
                break;
            }
            if(num < 0){
                System.out.println("Número inválido. Porfavor, digite um número inteiro positivo ou 0 para sair: ");

            } else {
                System.out.println("Tabuada do " + num + ":");
                for (int i = 1; i <= 10; i++) {
                    int resultado = num * i;
                    String paridade;
                    if (resultado % 2 ==0) {
                        paridade = "par";
                    } else {
                        paridade = "ímpar";
                    }
                    System.out.printf("%d * %d = %d (%s)\n", num, i, resultado, paridade);
                    if(i == 10){
                        System.out.println("==========Fim da tabuada==========");
                    }
                }
            }
        }
        sc.close();
    }
}