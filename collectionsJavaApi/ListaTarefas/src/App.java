public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de tarefas atualmente é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de tarefas atualmente é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de tarefas atualmente é: " + listaTarefa.obterNumeroTotalTarefas());

        System.out.println();
        listaTarefa.obterDescricoesTarefas();

    }
}

