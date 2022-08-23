fun main() {
    /*1. Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch
     */

    println("***Bem-Vindo a sua Lista de Compras!***")
    println("Faça seu cadastro para continuar =) ")
    try {
        print("Digite seu nome: ")
        val nome = readln()

        print("Digite seu endereço: ")
        val endereco = readln()

        print("Digite seu telefone (Ex. (11)999999999): ")
        val telefone = readln()

        val cliente1 = Cliente(nome, endereco, telefone)

        while (true){
            print("1 - Adicionar item\n" +
                    "2 - Remover item\n" +
                    "3 - Exibir lista de compras\n" +
                    "4 - Sair\n" +
                    "Digite a opção desejada: ")
            when(readln().toInt()){
                1 -> {
                    print("Digite o nome do item a ser adicionado: ")
                    val produto = readln()

                    cliente1.adicionarItem(produto)
                }
                2 -> {
                    print("Digite o nome do item a ser removido: ")
                    val produto = readln()

                    cliente1.removerItem(produto)
                }
                3 -> {
                    cliente1.exibirProdutos()
                }
                4 -> break
                else -> println("Opção inválida!!!")
            }
        }
    } catch (e:Exception){
        println(e.message)
    }

}