// Classe gato
class gato(nome: String, idade: Int) : Animal(nome, idade) {
    override fun fazerSom(): String {
        return "Miau"
    }

    fun miar(): String {
        return "Miau!"
    }
}