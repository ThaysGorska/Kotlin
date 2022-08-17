fun main() {
    /*Escrever um programa que receba vários números inteiros no teclado. E no
    final imprimir a média dos números múltiplos de 3. Para sair digitar
    0(zero).*/

    var soma = 0
    var cont = 0
    var med = 0

    do{
        print("Digite um número: ")
        val num = readln().toInt()

        if(num % 3 == 0 && num != 0) {
            cont++
            soma = soma + num
            med = soma / cont
        }
    }
        while(num != 0)

        println("A média dos números multiplos de 3 é: $med")

}