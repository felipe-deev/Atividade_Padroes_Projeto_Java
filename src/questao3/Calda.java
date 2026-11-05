package questao3;
public class Calda extends Complemento {
    public static final double PRECO = 1.50;
    public Calda(Bebida bebida) { super(bebida); }
    @Override public String descricao() { return bebida.descricao() + " + Calda"; }
    @Override public double preco() { return bebida.preco() + PRECO; }
}
