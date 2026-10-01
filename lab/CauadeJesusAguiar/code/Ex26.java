package lab.CauadeJesusAguiar.code;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o total de segundos: ");
        int totalSegundos = sc.nextInt();
        
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos / 60);

        System.out.printf("\n %dh %dmin %ds", horas, minutos, totalSegundos);
        sc.close();
    }
}
