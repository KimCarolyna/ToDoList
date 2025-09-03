import Java.util.Scanner;
import Java.util.List;

Scanner entrada = new Scanner(System.in);

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

        while (true) {
            System.out.println("Escolha uma opção: 1-Adicionar Dado, 2-Remover Dado, 3-Listar Dados, 4-Sair");
            int opcao = entrada.nextInt();
            entrada.nextLine(); // Consumir a nova linha

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
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}