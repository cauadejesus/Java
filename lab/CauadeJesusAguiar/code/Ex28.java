package lab.CauadeJesusAguiar.code;
public class Ex28 {
    //Tinha dado erro, pois os valores de entrada estavam como int 
    // e o resultado era um double
    public static void main(String[] args) {
        int totalAlunos = 25;
        int alunosAprovados = 15;
        // Multiplicar por 100.0 também resolve e já entrega o formato de porcentagem (60.0)
        double taxaAprovacao = (double) alunosAprovados / totalAlunos * 100;
        System.out.println("Taxa de aprovação: " + taxaAprovacao + "%");
    }
}
