package questao1;
public class Vendas implements ObservadorEstoque {
    @Override public void estoqueAlterado(String produto, int anterior, int atual) {
        if (anterior == 0 && atual > 0) System.out.printf("[Vendas] %s voltou ao estoque: %d unidades.%n", produto, atual);
    }
}
