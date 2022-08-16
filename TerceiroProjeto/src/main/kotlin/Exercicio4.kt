import kotlin.math.pow

fun main(){

    /*Faça um programa em que permita a entrada de um número qualquer e exiba se estenúmero é par ou ímpar.
Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/

    print("Digite um número para saber se é par ou ímpar: ")
    val num = readln().toInt()
    val pot = num.toDouble().pow(2)

    if (num % 2 == 0) {
        val raiz = Math.sqrt(num.toDouble())
        println("O número digitado é: PAR e sua raiz quadrada é: ${"%.2f".format(raiz)}")
    }
    else{
        println("O número digitado é: ÍMPAR e seu quadrado é: $pot")
    }
}