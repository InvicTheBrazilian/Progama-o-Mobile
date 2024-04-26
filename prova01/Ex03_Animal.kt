// Classe animal
abstract class Animal(val nome: String, val idade: Int) {
    abstract fun fazerSom(): String
}

fun main() {
    // Informações dos animais
    val animais = listOf(
            cachorro("Robi", 12),
            gato("Mimi", 9),
            passaro("Firo", 3)
    )

    // Exibir informação sobre animal
    for (animal in animais) {
        println("Nome: ${animal.nome}, Idade: ${animal.idade}, Som: ${animal.fazerSom()}")

        when (animal) {
            is cachorro -> println(animal.latir())
            is gato -> println(animal.miar())
            is passaro -> println(animal.cantar())
        }

        println()
    }
}
