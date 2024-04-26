// Classe que representa carta
data class Carta(val valor: String, val naipe: Naipe)

// Enum para os naipes
enum class Naipe {
    ESPADAS, COPAS, OUROS, PAUS
}