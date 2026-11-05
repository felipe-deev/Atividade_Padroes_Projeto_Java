package questao1;
public interface ObservadorEstoque {
    void estoqueAlterado(String produto, int quantidadeAnterior, int novaQuantidade);
}
