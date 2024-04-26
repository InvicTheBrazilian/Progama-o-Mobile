// Classe cachorro
class cachorro(nome: String, idade: Int) : Animal(nome, idade) {
    override fun fazerSom(): String {
        return "Au au"
    }

    fun latir(): String {
        return "Au au!"
    }
}