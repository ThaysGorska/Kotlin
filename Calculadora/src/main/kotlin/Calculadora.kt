fun main(){
    //Criando uma calculadora

    println("Digite dois números para realizarmos a operação: ")
    var n1: Double = readln().toDouble()
    var n2: Double = readln().toDouble()


    println("Escolha a operação que deseja realizar: 1-soma/ 2-subtração/ 3- divisão/ 4-multiplicação: ")
    var opc = readln().toInt()

    if (opc == 1){
        println("A soma entre os números é: ${soma(n1, n2)}")
    }else if (opc == 2) {
        println("A subtração entre os números é: ${sub(n1, n2)}")
    }else if (opc == 3){
        println("A divisão entre os números é: ${div(n1, n2)}")
    }else{
        println("A multiplicação entre os números é: ${mult(n1, n2)}")
    }
}

