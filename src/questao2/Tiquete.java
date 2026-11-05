package questao2;
import java.util.Objects;
public class Tiquete {
    private final String placa;
    private final int minutos;
    private PoliticaCobranca politica;
    public Tiquete(String placa, int minutos, PoliticaCobranca politica) {
        if (placa == null || placa.trim().isEmpty() || minutos < 0) throw new IllegalArgumentException("Tiquete invalido");
        this.placa = placa; this.minutos = minutos; setPolitica(politica);
    }
    public void setPolitica(PoliticaCobranca politica) { this.politica = Objects.requireNonNull(politica); }
    public double calcularValor() { return politica.calcular(minutos); }
    public String getPlaca() { return placa; }
    public int getMinutos() { return minutos; }
    public String getPerfil() { return politica.nome(); }
}
