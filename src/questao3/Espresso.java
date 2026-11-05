package questao3;
public class Espresso implements Bebida {
    public static final double PRECO = 6.00;
    @Override public String descricao() { return "Espresso"; }
    @Override public double preco() { return PRECO; }
}
