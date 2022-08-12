fun main() {


    var Excesso: Int = 0
    var Multa: Int = 0


    println("Digite o peso dos tomates: ")
    var P: Int = readLine()!!.toInt()

    Excesso = P - 50

    if (Excesso > 0) {

        Multa = 4 * Excesso

        println("O valor da multa a se pagar é de: R$" + Multa + ", e o excesso é de: " + Excesso + " kg de tomate.")

    } else {

        Multa = 0
        Excesso = 0

        println("O valor da multa é: R$" + Multa + " pois teve " + Excesso + " kg de excesso!!!")
    }
}