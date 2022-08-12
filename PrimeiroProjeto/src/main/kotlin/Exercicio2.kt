fun main () {

    var cont : Int = 0

    for (x in 0 until 501 step 3) {
        print("|" + x)

        if (x % 2 == 1) {
            cont = cont + x
        }
    }
    println()
    println(cont)
}