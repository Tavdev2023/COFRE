
abstract class Moeda {
        public double valor;

        public Moeda(double valor) {
            this.valor = valor;
        }

        public double getValor() {
            return valor;
        }

        public abstract void info();

        public abstract double converterParaReais();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Moeda moeda = (Moeda) obj;
        return Double.compare(moeda.valor, valor) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(valor);
    }
}

