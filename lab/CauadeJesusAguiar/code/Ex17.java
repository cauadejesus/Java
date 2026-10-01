package lab.CauadeJesusAguiar.code;

public class Ex17 {
    public static void main(String[] args) {
        String descricao = "Teclado Mecânico RGB";
        int codigo = 45012;
        double preco = 289.90;
        String categoria = "Periféricos";
        boolean disponivel = true;

        System.out.printf("PRODUTO: %s [Cód: %d] \n", descricao, codigo);
        System.out.printf("Categoria: %s | Preço: R$ %.2f \n", categoria, preco);
        System.out.printf("Disponibilidade: %s", disponivel ? "Em estoque" : "Esgotado"); //operador ternário
    }
}
