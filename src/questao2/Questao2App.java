package questao2;
import java.util.Locale;
public class Questao2App {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        System.out.println("=== QUESTAO 2: STRATEGY ===");
        Tiquete t = new Tiquete("ABC1D23", 125, new TarifaRotativa());
        imprimir(t);
        t.setPolitica(new TarifaMensalista()); imprimir(t);
        t.setPolitica(new TarifaConveniado()); imprimir(t);
        System.out.println("Conveniado com 30 minutos (gratuito):");
        imprimir(new Tiquete("XYZ9A87", 30, new TarifaConveniado()));
    }
    private static void imprimir(Tiquete t) {
        System.out.printf("Placa: %s | Permanencia: %d min | Perfil: %s | Valor: R$ %.2f%n", t.getPlaca(), t.getMinutos(), t.getPerfil(), t.calcularValor());
    }
}
