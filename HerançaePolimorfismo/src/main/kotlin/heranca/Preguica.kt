package heranca

class Preguica(nome: String, idade: Int) : Animal(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("Fazendo um som estranho")
    }

    fun subir(){
        println("A preguiça está subindo na árvore")
    }

    fun saber(){
        println("Curiosidade: As preguiças são excelentes nadadoras e conseguem prender a respiração de baixo da água por 40 minutos.")
    }

}