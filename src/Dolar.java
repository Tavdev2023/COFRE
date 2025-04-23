public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.printf("Dólar: US$%.2f\n", valor);
    }

    @Override
    public double converterParaReais() {
        return valor * 5.71;// Taxa de conversão 23/04/2025
    }
}