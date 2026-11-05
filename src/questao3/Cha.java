package questao3;
public class Cha implements Bebida {
    public static final double PRECO = 5.00;
    @Override public String descricao() { return "Cha"; }
    @Override public double preco() { return PRECO; }
}
