package questao3;
public class Chantilly extends Complemento {
    public static final double PRECO = 3.00;
    public Chantilly(Bebida bebida) { super(bebida); }
    @Override public String descricao() { return bebida.descricao() + " + Chantilly"; }
    @Override public double preco() { return bebida.preco() + PRECO; }
}
