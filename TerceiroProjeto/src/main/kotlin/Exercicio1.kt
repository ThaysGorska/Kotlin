fun main(){

    /*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

    print("Digite o primeiro número: ")
    val numA = readln().toInt()
    var maior = numA
    var menor = numA

    print("Digite o segundo número: ")
    val numB = readln().toInt()

    print("Digite o terceiro número: ")
    val numC = readln().toInt()

    if (menor > numB ){
        menor = numB
    }

    if (menor > numC){
        menor = numC
    }

    if (maior < numB){
        maior = numB
    }

    if (maior < numC){
        maior = numC
    }
    println("O maior número é o: " + maior)
    println("O menor númeor é o: " + menor)
}