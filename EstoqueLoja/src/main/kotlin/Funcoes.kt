val objetos = mutableListOf<String>()

//Função para adicionar itens a lista
fun objetosAdd() {
    while (true){
        println("Digite o item: ")
        val item = readln()
        if (item.isNotEmpty()){
            objetos.add(item)
        }else{
            break
        }

    }
}

//Função para remover itens da lista
fun objetosRem() {
    while (true){
        println("Digite o item que gostaria de excluir: ")
        val item = readln()
        if (objetos.contains(item)){
            objetos.remove(item)
            println("O item $item foi excluído com sucesso!")
        }else{
            println("O item $item não existe na lista.")
        }

    }
}

//Função para atualizar os objetos da lista
fun objetosAtu() {
        println("Digite o item que gostaria de atualizar: ")
        val item = readln()

    if (objetos.contains(item)){
        val origem = objetos.indexOf(item)
            println("Digite o novo item: ")
            objetos[origem] = readln()
            println("Item atualizado com sucesso!")
        }else{
            println("O item $item não existe na lista.")
        }

}

//Função para apresentar os itens
fun objetosGet(){
    println()
    println(objetos)
}