//Escreva um programa que leia um número entre 1 e 12 correspondendo a um mês do ano e imprima o nome desse mês.
//Utilize o comando when. Caso o valor seja fora deste intevalo, imprima uma mensagem de erro.
// Equipe: Caio Tobias Garcia

fun main() {
    // Inserir o numero correspondente ao mês
    println("Digite um número entre 1 e 12 correspondente a um mês do ano:")
    val numeroMes = readLine()?.toIntOrNull()

    // Determinando o mês
    when (numeroMes) {
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else -> println("Este mês não existe")
    }
}
