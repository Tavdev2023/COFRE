
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofre cofre = new Cofre();

        while (true) {
            System.out.println("\n--- MENU COFRINHO ---");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em reais");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.println("Tipo de moeda (1-Real, 2-Dólar, 3-Euro): ");
                    int tipo = scanner.nextInt();
                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();
                    Moeda nova = null;
                    if (tipo == 1) nova = new Real(valor);
                    else if (tipo == 2) nova = new Dolar(valor);
                    else if (tipo == 3) nova = new Euro(valor);

                    if (nova != null) {
                        cofre.adicionarMoeda(nova);
                        System.out.println("Moeda adicionada com sucesso.");
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;

                case 2:
                    System.out.println("Tipo de moeda para remover (1-Real, 2-Dólar, 3-Euro): ");
                    int tipoRemover = scanner.nextInt();
                    System.out.print("Valor: ");
                    double valorRemover = scanner.nextDouble();
                    Moeda remover = null;
                    if (tipoRemover == 1) remover = new Real(valorRemover);
                    else if (tipoRemover == 2) remover = new Dolar(valorRemover);
                    else if (tipoRemover == 3) remover = new Euro(valorRemover);

                    if (remover != null) {
                        cofre.removerMoeda(remover);
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;
                case 3:
                    cofre.listarMoedas();
                    break;

                case 4:
                    double total = cofre.calcularTotalEmReais();
                    System.out.printf("Total em reais: R$%.2f\n", total);
                    break;

                case 5:
                    System.out.println("Obrigado pela preferência!");
                    System.out.println("Encerrando...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}