package questao2;
public class TarifaRotativa implements PoliticaCobranca {
    public static final double VALOR_HORA = 12.00;
    @Override public double calcular(int minutos) { return Math.ceil(minutos / 60.0) * VALOR_HORA; }
    @Override public String nome() { return "Rotativo"; }
}
