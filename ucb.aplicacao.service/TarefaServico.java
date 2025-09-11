import java.util.ArrayList;
import java.util.List;

public class TarefaServico {
    private List<Tarefa> tarefas = new ArrayList<>();
    private int contadorID = 1;


    public void criarTarefa(String titulo, String descricao) {
        Tarefa nova = new Tarefa (contadorID++, titulo, descricao);
        tarefas.add(nova);
        System.out.println("\nTarefa criada com sucesso!\n");
    }
    public void listarTarefa(){
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada");
        } else {
            tarefas.forEach(System.out::println);
        }
    }

    public void atualizarTarefa(int id, String novoTitulo, String novaDescricao) {
        for (Tarefa t : tarefas) {
            if (t.getID() == id) {
                t.setTitulo(novoTitulo);
                t.setDescricao(novaDescricao);
                System.out.println("Tarefa atualizada com sucesso");
            }
        }
        System.out.println("Tarefa com ID " + id + " não encontrada");
    }

    public void removerTarefa(int id) {
        boolean removida = tarefas.removeIf(t -> t.getID() == id);
        if (removida) {
            System.out.println("Tarefa removida com sucesso");
        } else {
            System.out.println("Tarefa com ID " + id + " não encontrada");
        }
    }

    public void marcarComoConcluida(int id) {
        for (Tarefa t :tarefas) {
            if (t.getID() == id) {
                t.setCompleta(true);
                System.out.println("Tarefa marcada como concluída");
                return;
            }
        }

        System.out.println("Tarefa com ID " + id + " não encontrada");
    }
}
