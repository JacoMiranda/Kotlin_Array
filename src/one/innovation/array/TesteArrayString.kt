package one.innovation.array

import java.util.*

fun main() {
    val nomes = Array(3) { "" }
    nomes[0] = "Zazá"
    nomes[1] = "Maria"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }
    println("______")
    nomes.sort()
    nomes.forEach { println(it) }
    println("______")
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}