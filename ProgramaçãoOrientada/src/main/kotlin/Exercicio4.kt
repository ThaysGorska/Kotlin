fun main(){
    /*Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/

    println("Digite o nome do funcionário: ")
    val nome = readln()

    println("Digite o código do funcionário: ")
    val codigo = readln().toInt()

    println("Digite o setor do funcionário: ")
    val setor = readln()

    println("Digite o salário do funcionário: ")
    val salario = readln().toDouble()

    println("Digite o valor do aumento salarial: ")
    val aumento = readln().toDouble()


    val funcionario1 = Funcionario(
        nome, codigo, setor, salario, aumento
    )
    funcionario1.funcionario()
}