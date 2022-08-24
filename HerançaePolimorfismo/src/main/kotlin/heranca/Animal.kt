package heranca

open class Animal (var nome: String, var idade: Int) {

    open fun emitirSom(){
        print("O animal está: ")
    }

    open fun mostrarDados(){
        println("O nome do animal é: $nome \n" +
                "O animal tem: $idade anos"
        )
    }

}