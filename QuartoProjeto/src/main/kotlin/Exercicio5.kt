fun main (){
    /*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.*/

    var soma = 0

    do {
        print("Digite um número: ")
        val num = readln().toInt()
        soma += num
        }
    while(num != 0)
    print("A soma de todos os numeros digitados resulta em: $soma")
}