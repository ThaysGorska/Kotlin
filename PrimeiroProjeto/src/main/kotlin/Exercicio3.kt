fun main() {

    println("Qual o valor de N: ")
    var N: Int = readLine()!!.toInt()


    if(N > 100) {
        println("O valor de N é: " + N)
    }
    else{
        N=0
        println("O valor digitado é igual a: " + N)
    }
}