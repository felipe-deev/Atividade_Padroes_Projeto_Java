package questao1;
public class Compras implements ObservadorEstoque {
    @Override public void estoqueAlterado(String produto, int anterior, int atual) {
        if (atual < 5) System.out.printf("[Compras] ALERTA: %s com estoque baixo (%d unidades).%n", produto, atual);
    }
}
