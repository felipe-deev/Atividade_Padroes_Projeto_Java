package questao1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Produto {
    private final String nome;
    private int quantidade;
    private final List<ObservadorEstoque> observadores = new ArrayList<>();
    public Produto(String nome, int quantidade) {
        if (nome == null || nome.trim().isEmpty() || quantidade < 0) throw new IllegalArgumentException("Produto invalido");
        this.nome = nome; this.quantidade = quantidade;
    }
    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
    public void adicionarObservador(ObservadorEstoque observador) {
        Objects.requireNonNull(observador);
        if (!observadores.contains(observador)) observadores.add(observador);
    }
    public void removerObservador(ObservadorEstoque observador) { observadores.remove(observador); }
    public void alterarQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0) throw new IllegalArgumentException("Estoque negativo nao permitido");
        if (novaQuantidade == quantidade) return;
        int anterior = quantidade;
        quantidade = novaQuantidade;
        for (ObservadorEstoque o : new ArrayList<>(observadores)) o.estoqueAlterado(nome, anterior, novaQuantidade);
    }
}
