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

// Classe baralho
class Baralho {
    private val cartas = mutableListOf<Carta>


// Array de valores das cartas
private val valores = listOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")

// Inicializando o baralho com as cartas
init Baralho {
    for (naipe in Naipe.values()) {
        for (valor in valores) {
            cartas.add(Carta(valor, naipe))
        }
    }
}

// Embaralhar o baralho
fun embaralhar() {
    cartas.shuffle()
}

// Distribuir cartas para o jogador
fun distribuirCartas(): List<Card> {
    return cartas.subList(0, 5).also {
        cartas.removeAll(it)
    }
}
}

// Função par
fun temPar(cartas: List<Card>): Boolean {
    val valores = cartas.map { it.valor }
    return valores.size != valores.toSet().size
}

// Função trinca
fun temTrinca(cartas: List<Card>): Boolean {
    val agrupadoPorValor = cartas.groupBy { it.valor }
    return agrupadoPorValor.any { it.value.size == 3 }
}

// Função full house
fun temFullHouse(cartas: List<Card>): Boolean {
    val agrupadoPorValor = cartas.groupBy { it.valor }
    return agrupadoPorValor.any { it.value.size == 3 } && agrupadoPorValor.any { it.value.size == 2 }
}

// Função flush
fun temFlush(cartas: List<Card>): Boolean {
    val naipe = cartas.first().naipe
    return cartas.all { it.naipe == naipe }
}
