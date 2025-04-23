public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.printf("Euro: €%.2f\n", valor);
    }

    @Override
    public double converterParaReais() {
        return valor * 6.47; // Taxa de conversão 23/04/2025
    }
}
