package questao1;
public class Questao1App {
    public static void main(String[] args) {
        Produto cafe = new Produto("Cafe em graos", 10);
        Compras compras = new Compras(); Vendas vendas = new Vendas(); Auditoria auditoria = new Auditoria();
        cafe.adicionarObservador(compras); cafe.adicionarObservador(vendas); cafe.adicionarObservador(auditoria);
        System.out.println("=== QUESTAO 1: OBSERVER ===");
        alterar(cafe, 4); alterar(cafe, 0); alterar(cafe, 0); alterar(cafe, 8);
        System.out.println("Removendo Auditoria..."); cafe.removerObservador(auditoria);
        alterar(cafe, 2); alterar(cafe, 0); alterar(cafe, 6);
    }
    private static void alterar(Produto p, int n) {
        System.out.printf("%nAlterando %s para %d unidades:%n", p.getNome(), n); p.alterarQuantidade(n);
    }
}
