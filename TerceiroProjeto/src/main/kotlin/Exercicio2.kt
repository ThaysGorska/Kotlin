fun main (){
    /*Faça um programa que entre com três números e coloque em ordem crescente.*/

    print("Digite o primeiro número: ")
    val numA = readln().toInt()

    print("Digite o segundo número: ")
    val numB = readln().toInt()

    print("Digite o terceiro número: ")
    val numC = readln().toInt()

    if (numA <= numB && numB <= numC)
    {
        println(" A ordem crescente dos números é: $numA, $numB, $numC")
    }
    else if (numA <= numC && numC <= numB)
    {
        println("A ordem crescente dos números é: $numA, $numC, $numB")
    }
    else if (numB <= numA && numA <= numC)
    {
        println("A ordem crescente dos números é: $numB, $numA, $numC")
    }
    else if (numB <= numC && numC <= numA)
    {
        println("A ordem crescente dos números é: $numB, $numC, $numA")
    }
    else if (numC <= numA && numA <= numB)
    {
        println("A ordem crescente dos números é: $numC, $numA, $numB")
    }
    else
    {
        numC <= numB && numB < numA
        println("A ordem crescente dos números é: $numC, $numB, $numA ")
    }
}