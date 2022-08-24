package heranca

class Cavalo(nome: String, idade: Int) : Animal(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("Relinchando")
    }

    fun correr(){
        println("O cavalo está correndo")
    }

    fun trotar(){
        println("O cavalo está trotando")
    }

    fun saber(){
        println("Curiosidade: Cavalos tem excelente memória. Eles são capazes de reconhecer uma pessoa anos" +
                " depois de tê-la visto pela última vez.")
    }

}