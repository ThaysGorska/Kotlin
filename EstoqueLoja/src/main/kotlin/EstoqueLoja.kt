fun main(){
    while (true){
        println("1 - Adicionar itens")
        println("2 - Remover itens")
        println("3 - Atualizar itens")
        println("4 - Mostrar todos os itens da lista")
        println("5 - Sair")

        println("Digite a opção desejada: ")

        when(readln().toInt()){
            1 -> objetosAdd()
            2 -> objetosRem()
            3 -> objetosAtu()
            4 -> objetosGet()
            5 -> break
            else-> println("Opção inválida!")
        }

    }
}

