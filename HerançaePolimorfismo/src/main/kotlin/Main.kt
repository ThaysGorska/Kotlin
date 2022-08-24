import heranca.Cachorro
import heranca.Cavalo
import heranca.Preguica

fun main() {
    println("*****Bem-Vindo ao Zoológico da Thays*****")

    val cachorro = Cachorro("Hernesto", 14)
    val cavalo = Cavalo("Patrício", 27)
    val preguica = Preguica("Filomena", 32)

    while (true){
        print("Escolha o animal que deseja conhecer: \n" +
                "1- Cachorro \n" +
                "2- Cavalo \n" +
                "3- Preguiça \n"
        )

        when(readln().toInt()){
            1-> {
                cachorro.mostrarDados()
                cachorro.correr()
                cachorro.emitirSom()
                cachorro.saber()
            }
            2-> {
                cavalo.mostrarDados()
                cavalo.trotar()
                cavalo.emitirSom()
                cavalo.saber()
            }
            3-> {
                preguica.mostrarDados()
                preguica.subir()
                preguica.emitirSom()
                preguica.saber()
            }
        }
    }

}