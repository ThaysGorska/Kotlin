fun main() {

    /*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

    print("Digite o nome do cliente: ")
    val nome = readln()

    print("Digite o e-mail do cliente: ")
    val email = readln()

    print("Digite o telefone do cliente: ")
    val tel = readln()

    print("Digite o CPF do cliente: ")
    val cpf = readln()

    print("Digite a idade do cliente: ")
    val idade = readln().toInt()

    val cliente1 = Cliente (
        nome, email, tel, cpf, idade)

    cliente1.cliente()
}