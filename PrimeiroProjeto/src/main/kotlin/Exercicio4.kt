fun main (){

    var res: Int = 0

    println("Digite um número: ")
    var n1: Int = readln().toInt()

    println("Digite um número: ")
    var n2: Int = readln().toInt()

    res = n1 + n2

    if (res % 2 == 0) {
        println("A soma dos dois números é: $res e ele é Par")
    } else {
        println("A soma dos dois números é: $res e ele é Ímpar")
    }

}