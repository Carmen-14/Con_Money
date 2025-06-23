import java.util.Map;
import java.util.HashMap;

public class ConversorMonedas {
    private final Map<String, Double> tasasCambio;

    public ConversorMonedas() {
        tasasCambio = new HashMap<>();
        tasasCambio.put("USD", 1.0);
        tasasCambio.put("EUR", 0.92);
        tasasCambio.put("CLP", 890.0);
        tasasCambio.put("JPY", 151.0);
    }

    public double convertir(double cantidad, String de, String a) {
        double enUSD = cantidad / tasasCambio.get(de);
        return enUSD * tasasCambio.get(a);
    }
}
