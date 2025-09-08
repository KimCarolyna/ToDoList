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
    System.out.println("1 - Criar tarefa");
    System.out.println("2 - Listar tarefas");
    System.out.println("3 - Atualizar tarefa");
    System.out.println("4 - Remover tarefa");
    System.out.println("5 - Sair");

    int opcao = entrada.nextInt();
    entrada.nextLine(); // Consumir a quebra de linha

    switch (opcao) {
        case 1:
            System.out.print("Digite a nova tarefa: ");
            String novaTarefa = entrada.nextLine();
            gerenciador.criarTarefa(novaTarefa);
            break;

        case 2:
            gerenciador.listarTarefas();
            break;

        case 3:
            gerenciador.listarTarefas();
            System.out.print("Digite o índice da tarefa a atualizar (começa em 0): ");
            int indiceAtualizar = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Digite a nova descrição da tarefa: ");
            String tarefaAtualizada = entrada.nextLine();
            gerenciador.atualizarTarefa(indiceAtualizar, tarefaAtualizada);
            break;

        case 4:
            gerenciador.listarTarefas();
            System.out.print("Digite o índice da tarefa a remover (começa em 0): ");
            int indiceRemover = entrada.nextInt();
            entrada.nextLine();
            gerenciador.removerTarefa(indiceRemover);
            break;

        case 5:
            System.out.println("Saindo...");
            entrada.close();
            return;

        default:
            System.out.println("Opção inválida. Tente novamente.");
    }
}
