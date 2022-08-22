class Cliente (
    var nome: String,
    var email: String,
    var telefone: String,
    var cpf: String
) {

    var idade = 0

    constructor(
        nome: String,
        email: String,
        telefone: String,
        cpf: String,
        idade: Int

    ): this(nome, email, telefone, cpf){
        this.idade = idade
    }

    fun cliente () {
        println("O(A) cliente $nome, com o e-mail $email, telefone $telefone e CPF $cpf, foi cadastrado.")
    }
}