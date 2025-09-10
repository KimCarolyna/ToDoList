import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        TarefaServico servico = new TarefaServico();
        Scanner entrada = new Scanner(System.in);

    while (true) {
        System.out.println("----MENU----");
        System.out.println("1 - Criar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Atualizar tarefa");
        System.out.println("4 - Remover tarefa");
        System.out.println("5 - Marcar como concluída");
        System.out.println("6 - Sair");
        System.out.println("\nEscolha uma opção:");

    int opcao = entrada.nextInt();
    entrada.nextLine();

    switch (opcao) {
        case 1:
            System.out.print("Título: ");
            String titulo = entrada.nextLine();
            System.out.print("Descrição: ");
            String descricao = entrada.nextLine();
            servico.criarTarefa(titulo, descricao);
            break;


        case 2:
            gerenciador.listarTarefas();
            break;

        case 3:
            System.out.print("ID da tarefa a atualizar: ");
            int idAtualizar = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Novo título: ");
            String novoTitulo = entrada.nextLine();
            System.out.print("Nova descrição: ");
            String novaDescricao = entrada.nextLine();
            servico.atualizarTarefa(idAtualizar, novoTitulo, novaDescricao);
            break;
            
        case 4:
            System.out.print("ID da tarefa a remover: ");
            int idRemover = entrada.nextInt();
            entrada.nextLine();
            servico.removerTarefa(idRemover);
            break;

        case 5:
            System.out.print("ID da tarefa a marcar como concluída: ");
            int idConcluir = entrada.nextInt();
            entrada.nextLine();
            servico.marcarComoConcluida(idConcluir);
            break;

        case 6:
            System.out.println("Saino...");
            entrada.close();
            return;

        default:
            System.out.println("Opção inválida. Tente novamente.");
    }
}
