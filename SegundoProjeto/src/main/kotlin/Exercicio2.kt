fun main(){

    /*2 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele*/

    print("Digite o diâmetro do cículo: ")
    var diametro = readln().toDouble()

    var area = 3.14 * (diametro * diametro) / 4
    var perimetro = (2 * 3.14) * (diametro / 2)

    println("A área do círculo é de: ${"%.2f".format(area)}")
    println("O perimetro do cículo é de: ${"%.2f".format(perimetro)}")
}