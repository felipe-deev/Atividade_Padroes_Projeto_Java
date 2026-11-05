package questao3;
import java.util.Locale;
public class Questao3App {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        System.out.println("=== QUESTAO 3: DECORATOR ===");
        Bebida pedido1 = new Chantilly(new Leite(new Espresso()));
        Bebida pedido2 = new Calda(new Cha());
        Bebida pedido3 = new Leite(new Leite(new Calda(new Espresso())));
        imprimir(1, pedido1); imprimir(2, pedido2); imprimir(3, pedido3);
    }
    private static void imprimir(int numero, Bebida bebida) {
        System.out.printf("Pedido %d: %s | Total: R$ %.2f%n", numero, bebida.descricao(), bebida.preco());
    }
}
