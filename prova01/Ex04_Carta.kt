//Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor.
//Crie uma classe Baralhoque represente um baralho de cartas completo.
//Implemente métodos para embaralhar o baralho, distribuir cartas.
//Entregue 5 cartas para um Jogador que vai verificar se as cartas possuem combinações vencedoras,
//como:

//Par: Duas cartas com mesmo valor

//Exemplo: A♠️ + A♥️

//Trinca: Três cartas com mesmo valor

//Exemplo: A♠️ + A♥️ + A♦️

//Full House: Três cartas com mesmo valor mais outras duas com mesmo valor

//Exemplo: A♠️ + A♥️ + A♦️+ 5♣️ + 5♥️

//Flush: Todas cartas com mesmo naipe

//Exemplo: A♦️+ 3♦️+ 6♦️ + Q♦️ + 10♦️

//Equipe: Caio Tobias Garcia

// Classe que representa carta
data class Carta(val valor: String, val naipe: Naipe)

// Enum para os naipes
enum class Naipe {
    ESPADAS, COPAS, OUROS, PAUS
}
