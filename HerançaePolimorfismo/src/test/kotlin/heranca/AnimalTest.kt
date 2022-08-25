package heranca

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class AnimalTest {

    val dados = Animal("Patrício", 27)

    @Test
    fun mostrarDados() {
        dados.mostrarDados()
    }
}