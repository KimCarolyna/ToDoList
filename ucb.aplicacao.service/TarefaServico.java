import ucb.aplicacao.model.Tarefa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TarefaServico {
    private List<String> tarefas;
    
    public TarefaServico(List<String> tarefasIniciais) {
        this.tarefas = tarefasIniciais;
    }

    public void criarTarefa(String tarefa) {
        tarefas.add(tarefa);
    }

    public void listarTarefas() {
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + " - " + tarefas.get(i));
        }
    }

    public void atualizarTarefa(int indice, String novaTarefa) {
        tarefas.set(indice, novaTarefa);
    }

    public void removerTarefa(int indice) {
        tarefas.remove(indice);
    }

    public static void main(String[] args) {
        TarefaServiso gerenciador = new TarefaServiso(new ArrayList<>());
        Scanner entrada = new Scanner(System.in);

         while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Criar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Atualizar tarefa");
            System.out.println("4 - Remover tarefa");
            System.out.println("5 - Sair");

            int opcao = entrada.nextInt();
            entrada.nextLine(); // Consumir quebra de linha

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
                    System.out.print("Digite o índice da tarefa a atualizar: ");
                    int indiceAtualizar = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Digite a nova descrição da tarefa: ");
                    String tarefaAtualizada = entrada.nextLine();
                    gerenciador.atualizarTarefa(indiceAtualizar, tarefaAtualizada);
                    break;

                case 4:
                    System.out.print("Digite o índice da tarefa a remover: ");
                    int indiceRemover = entrada.nextInt();
                    entrada.nextLine();
                    gerenciador.removerTarefa(indiceRemover);
                    break;

                case 5:
                    entrada.close();
                    return;
            }
        }
    }
}

