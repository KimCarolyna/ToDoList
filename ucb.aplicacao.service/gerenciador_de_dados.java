import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorDeDados {
    private List<String> dados;

    public GerenciadorDeDados(List<String> dadosIniciais) {
        this.dados = dadosIniciais;
    }

    public void adicionarDado(String dado) {
        dados.add(dado);
        System.out.println("Dado adicionado com sucesso.");
    }

    public void removerDado(String dado) {
        if (dados.remove(dado)) {
            System.out.println("Dado removido com sucesso.");
        } else {
            System.out.println("Dado não encontrado.");
        }
    }

    public void listarDados() {
        System.out.println("Dados atuais:");
        for (String dado : dados) {
            System.out.println(dado);
        }
    }

    public static void main(String[] args) {
        GerenciadorDeDados gerenciador = new GerenciadorDeDados(new ArrayList<>());
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar Dado");
            System.out.println("2 - Remover Dado");
            System.out.println("3 - Listar Dados");
            System.out.println("4 - Sair");
            
            System.out.print("Opção: ");
            int opcao = entrada.nextInt();
            entrada.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o dado a ser adicionado: ");
                    String dadoAdicionar = entrada.nextLine();
                    gerenciador.adicionarDado(dadoAdicionar);
                    break;
                case 2:
                    System.out.print("Digite o dado a ser removido: ");
                    String dadoRemover = entrada.nextLine();
                    gerenciador.removerDado(dadoRemover);
                    break;
                case 3:
                    gerenciador.listarDados();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    entrada.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}