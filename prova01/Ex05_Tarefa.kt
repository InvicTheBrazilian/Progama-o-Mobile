// Classe tarefa
data class Tarefa(
    val titulo: String,
    val descricao: String,
    val dataVencimento: String,
    val prioridade: String,
    var concluida: Boolean = false
)