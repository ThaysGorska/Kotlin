package heranca

class Cachorro(nome: String, idade: Int) : Animal(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("Latindo")
    }

    fun correr(){
        println("O cachorro está correndo")
    }

    fun andar(){
        println("O cachorro está andando")
    }

    fun saber(){
        println("Curiosidade: O olfato canino é 1 milhão de vezes melhor do que o dos humanos e o nariz de cada cachorro é único, " +
                "assim como nossa impressão digital.")
    }
}