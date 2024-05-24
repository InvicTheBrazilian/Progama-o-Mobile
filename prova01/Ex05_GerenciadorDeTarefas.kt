//Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título,
//descrição, data de vencimento e prioridade.
//Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas.
//Implemente métodos para adicionar, remover,
//buscar, marcar como concluída e listar tarefas por data de vencimento.
//Equipe: Caio Tobias Garcia

class GerenciadorDeTarefas {
    private val listaTarefas = mutableListOf<Tarefa>()

    // Adicionar uma tarefa à lista
    fun adicionarTarefa(tarefa: Tarefa) {
        listaTarefas.add(tarefa)
    }

    // Remover uma tarefa da lista
    fun removerTarefa(titulo: String) {
        val tarefa = listaTarefas.find { it.titulo == titulo }
        tarefa?.let { listaTarefas.remove(it) }
    }

    // Buscar uma tarefa pelo título
    fun buscarTarefa(titulo: String): Tarefa? {
        return listaTarefas.find { it.titulo == titulo }
    }

    // Marcar uma tarefa como concluída
    fun marcarComoConcluida(titulo: String) {
        val tarefa = listaTarefas.find { it.titulo == titulo }
        tarefa?.concluida = true
    }

    // Listar tarefas por data de vencimento
    fun listarTarefasPorDataVencimento() {
        val tarefasOrdenadas = listaTarefas.sortedBy { it.dataVencimento }
        println("Tarefas ordenadas por data de vencimento:")
        tarefasOrdenadas.forEach {
            println("Título: ${it.titulo}, Descrição: ${it.descricao}, Data de Vencimento: ${it.dataVencimento}, Prioridade: ${it.prioridade}, Concluída: ${it.concluida}")
        }
    }
}
