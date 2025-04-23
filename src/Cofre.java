import java.util.ArrayList;
import java.util.List;

public class Cofre {
    public List<Moeda> moedas;

    public Cofre() {
        this.moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda(Moeda moeda) {
        if (moedas.remove(moeda)) {
            System.out.println("Moeda removida com sucesso.");
        } else {
            System.out.println("Moeda não encontrada no cofre.");
        }
    }

    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            System.out.println("Moedas no cofrinho:");
            for (Moeda moeda : moedas) {
                System.out.println(moeda);
            }
        }
    }

    public double calcularTotalEmReais() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReais();
        }
        return total;
    }
}
