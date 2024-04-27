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

fun main() {
    val baralho = Baralho()
    baralho.embaralhar()
    val cartasJogador = baralho.distribuirCartas()

    println("Cartas do jogador:")
    cartasJogador.forEach { println("${it.valor} ${it.naipe}") }

    println("Verificando combinações:")
    if (temPar(cartasJogador)) println("Par")
    if (temTrinca(cartasJogador)) println("Trinca")
    if (temFullHouse(cartasJogador)) println("Full House")
    if (temFlush(cartasJogador)) println("Flush")
}
