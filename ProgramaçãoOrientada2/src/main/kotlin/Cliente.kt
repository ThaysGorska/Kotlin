class Cliente (var nome:String, var endereco:String, var telefone:String) {

    val listaCompras = mutableListOf<String>()

    init {
        if (nome.isBlank()) {
            throw Exception("Nome inválido!")
        }
    }
    fun adicionarItem(compra: String){

        if(compra.isNotBlank()){
            listaCompras.add(compra)
        }else{
            print("Produto inválido!")
        }
    }

    fun removerItem(compra: String){
        if(listaCompras.contains(compra)){
            listaCompras.remove(compra)
        }else{
            print("Produto inválido!")
        }
    }

    fun exibirProdutos (){
        println("*****Sacola de Compras*****\n")
        listaCompras.forEach {
            println(it)
        }
    }
}



