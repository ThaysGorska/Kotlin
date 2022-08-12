fun main (){

    var resultado: Int = 0

    println("Digite um número: ")
    var num1: Int = readLine()!!.toInt()

    println("Digite outro número: ")
    var num2: Int = readLine()!!.toInt()

    resultado = num1 + num2

    if (resultado % 2 == 0) {
        println("A soma dos dois números é: " +resultado + " e o número é Par")
    } else {
        println("A soma dos dois números é: " +resultado + " e o número é Ímpar")
    }

}