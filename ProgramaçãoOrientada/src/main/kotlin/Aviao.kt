class Aviao (
    var fabricante: String,
    var numeroModelo: Int,
    var numeroAssentos: Int,
    var numMotor: Int
    ) {
    var combustivel = 0.0

    constructor(
        fabricante: String,
        numeroModelo: Int,
        numeroAssentos: Int,
        numMotor: Int,
        combustivel: Double
    ): this(fabricante, numeroModelo, numeroAssentos, numMotor){
        this.combustivel = combustivel
    }

    fun aviao(){
        println("As informações sobre a aeronave são: ")
        println("Fabricante: $fabricante")
        println("Número de modelo: $numeroModelo")
        println("Número de assentos: $numeroAssentos")
        println("Quantidade de motores: $numMotor motores")
        println("Registro de combustível: $combustivel mil litros")
    }

}