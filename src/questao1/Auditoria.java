package questao1;
public class Auditoria implements ObservadorEstoque {
    @Override public void estoqueAlterado(String produto, int anterior, int atual) {
        System.out.printf("[Auditoria] %s: %d -> %d unidades.%n", produto, anterior, atual);
    }
}
