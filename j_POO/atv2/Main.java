import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    /*Objetivo: Praticar o controle de fluxo com um laço while (ou do-while), múltiplas condicionais (switch ou if/else aninhado), operadores de atribuição (+=, -=) e formatação de saída.
    Enunciado:
    Crie um simulador de caixa eletrônico simples em Java. O usuário começa com um saldo inicial de R$ 500,00. O programa deve exibir um menu com as seguintes opções:
    1 - Consultar Saldo 2 - Realizar Depósito 3 - Realizar Saque 4 - Sair
    Regras:
    1ª O programa deve continuar exibindo o menu e processando as opções até que o usuário escolha a opção 4 (Sair).
    2ª Na opção de Depósito, o valor depositado deve ser somado ao saldo. O programa não deve aceitar depósitos de valores negativos.
    3ª Na opção de Saque, o valor deve ser subtraído do saldo. O programa não deve permitir saques de valores negativos e não deve permitir que o usuário saque um valor maior do que o saldo disponível (informando "Saldo insuficiente").
    4ª Se o usuário digitar uma opção inválida no menu principal, o programa deve avisar "Opção inválida" e mostrar o menu novamente.
    */
    double saldo = 500.00;
    int opcaoCaixaEletronico;
    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("\n\n==============================Caixa Eletrônico==============================");
        System.out.println("1 - Consultar Saldo 2 - Realizar Depósito 3 - Realizar Saque 4 - Sair");
        opcaoCaixaEletronico = sc.nextInt();
        switch (opcaoCaixaEletronico) {
            case 1:
                System.out.printf("Seu saldo é: R$ %.2f%n", saldo);
                break;
            case 2:
                System.out.println("Digite o valor do depósito: ");
                double valorDeposito = sc.nextDouble();
                if (valorDeposito > 0) {
                    saldo += valorDeposito;
                    System.out.println("Depósito realizado com sucesso!");
                } else {
                    System.out.println("Valor inválido para depósito.");
                }
                break;
            case 3:
                System.out.println("Digite o valor do saque: ");
                double valorSaque = sc.nextDouble();
                if (valorSaque <= 0) {
                    System.out.println("Valor inválido para saque.");
                } else if (valorSaque > saldo) {
                    System.out.println("Saldo insuficiente.");
                } else {    
                    saldo -= valorSaque;
                    System.out.println("Saque realizado com sucesso!");
                }
                break;
            case 4:
                System.out.println("Obrigado por utilizar o Caixa Eletrônico!");
                sc.close();
                return;
            default:
                System.out.println("Opção inválida");
                break;
            }
        }
    }
}