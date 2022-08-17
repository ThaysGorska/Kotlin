fun main(){
    /*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/

    var cont21 = 0
    var cont50 = 0

    while (true) {
        println("Digite sua idade: ")
        var idade = readln().toInt()

        if (idade in 1..21) {
            cont21++
        }else if (idade >= 50) {
            cont50++
        }
        if (idade == -99){
            break
        }

    }
    println("O total de pessoas com menos de 21 anos é: $cont21")
    println("O total de pessoas com mais de 50 anos é: $cont50")
}