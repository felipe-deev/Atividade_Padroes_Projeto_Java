package questao2;
public class TarifaMensalista implements PoliticaCobranca {
    public static final double VALOR_FIXO = 8.00;
    @Override public double calcular(int minutos) { return VALOR_FIXO; }
    @Override public String nome() { return "Mensalista"; }
}
