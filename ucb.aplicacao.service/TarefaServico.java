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
}
