package questao2;
public class TarifaConveniado implements PoliticaCobranca {
    public static final int MINUTOS_GRATIS = 30;
    public static final double VALOR_HORA = 12.00;
    public static final double DESCONTO_PERCENTUAL = 0.25;
    @Override public double calcular(int minutos) {
        int cobraveis = Math.max(0, minutos - MINUTOS_GRATIS);
        return Math.ceil(cobraveis / 60.0) * VALOR_HORA * (1 - DESCONTO_PERCENTUAL);
    }
    @Override public String nome() { return "Conveniado"; }
}
