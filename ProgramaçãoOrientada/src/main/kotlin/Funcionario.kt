import java.nio.file.FileSystemAlreadyExistsException

class Funcionario(
    var nome: String,
    var codigo: Int,
    var setor: String,
    var salario: Double

) {
    var aumento = 0.0

    constructor(
        nome: String,
        codigo: Int,
        setor: String,
        salario: Double,
        aumento: Double

    ): this(nome, codigo, setor, salario){
        this.aumento = aumento

    }

    fun funcionario(){
        println("As informações sobre o funcionário são: ")
        println("Nome: $nome")
        println("Código: $codigo")
        println("Setor: $setor")
        println("Salário: $salario: ")
        println("Aumento salarial: R$ $aumento")
        println("Novo salário: R$ ${salario+aumento}")

    }
}