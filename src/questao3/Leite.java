package questao3;
public class Leite extends Complemento {
    public static final double PRECO = 2.00;
    public Leite(Bebida bebida) { super(bebida); }
    @Override public String descricao() { return bebida.descricao() + " + Leite"; }
    @Override public double preco() { return bebida.preco() + PRECO; }
}
