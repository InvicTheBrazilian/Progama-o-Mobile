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