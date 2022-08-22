fun main() {

    /*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

    println("Digite o nome do fabricante da aeronave: ")
    val fabricante = readln()

    println("Digite o número do modelo da aeronave: ")
    val modelo = readln().toInt()

    println("Digite a quantidade de assentos disponiveis na aeronave: ")
    val assentos = readln().toInt()

    println("Digite a quantidade de motores presentes na aeronave: ")
    val motores = readln().toInt()

    println("Digite a capacidade de combustivel da aeronave: ")
    val combustivel = readln().toDouble()

    val aviao1 = Aviao(
        fabricante, modelo, assentos, motores, combustivel)

    aviao1.aviao()
}