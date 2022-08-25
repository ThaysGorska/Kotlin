import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class Teste {

    val cliente = Cliente("Thays", "Rua das Pitangas", "123456789")

    @BeforeEach
    fun adicionar(){
        cliente.adicionarItem("Nescau")
        cliente.adicionarItem("Tomate")
        cliente.adicionarItem("Escarola")
        cliente.adicionarItem("Maracujá")
    }

    @Test
    fun addTeste(){
        assertEquals(4, cliente.listaCompras.size)
        assertTrue(cliente.listaCompras.contains("Nescau"))
    }

    @Test
    fun remTeste(){
        cliente.removerItem("Escarola")
        assertEquals(3, cliente.listaCompras.size)
        assertFalse(cliente.listaCompras.contains("Escarola"))
    }

    @Test
    fun mostrar(){
        cliente.exibirProdutos()
        cliente.listaCompras
        }
    }
