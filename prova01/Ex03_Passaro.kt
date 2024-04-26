// Classe passaro
class passaro(nome: String, idade: Int) : Animal(nome, idade) {
    override fun fazerSom(): String {
        return "Cantar"
    }

    fun cantar(): String {
        return "Cantar!"
    }
}