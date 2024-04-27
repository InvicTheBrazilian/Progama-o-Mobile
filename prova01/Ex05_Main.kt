//Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título,
//descrição, data de vencimento e prioridade.
//Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas.
//Implemente métodos para adicionar, remover,
//buscar, marcar como concluída e listar tarefas por data de vencimento.
//Equipe: Caio Tobias Garcia

fun main() {
    // Criando tarefas
    val tarefa1 = Tarefa("Estudar", "Estudar programação", "22/05/2024", "Alta")
    val tarefa2 = Tarefa("Comprar", "Fazer a compra no mercado", "03/05/2024", "Média")
    val tarefa3 = Tarefa("Fazer exercício", "Fazer flexão,agachamento e abdominal", "30/04/2024", "Baixa")

    // Adicionando tarefas ao gerenciador
    GerenciadorDeTarefas.adicionarTarefa(tarefa1)
    GerenciadorDeTarefas.adicionarTarefa(tarefa2)
    GerenciadorDeTarefas.adicionarTarefa(tarefa3)

    // Listar por data de vencimento
    GerenciadorDeTarefas.listarTarefasPorDataVencimento()

    // Marcar como concluída
    GerenciadorDeTarefas.marcarComoConcluida("Estudar")

    // Listar por data de vencimento após marcar como concluída
    GerenciadorDeTarefas.listarTarefasPorDataVencimento()
    }
