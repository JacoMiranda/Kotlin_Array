package one.innovation.array

fun main() {

    val values = intArrayOf(2, 4, 1 ,3, 5, 10)

    values.forEach {
        println(it)
    }
    println("p1_____________")

    for (valor in values){
        println(valor)
    }
    println("p2_____________")
    for (index in values.indices)
        println(values[index])
    println("p3_____________")
}