fun main(){

    /*Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/

    var par: Int = 0
    var impar: Int = 0

    for (i in 0..10){
        print("Digite um número: ")
        var num = readln().toInt()

        if (num % 2 == 0){
            par++
        }
        else{
            impar++
        }

    }
    println("Os números pares são: $par")
    println("Os números ímpares são: $impar")
}