package one.innovation.array

fun main() {
    val values = IntArray(5)

    values[0]= 7
    values[1]= 3
    values[2]= 6
    values[3]= 2
    values[4]= 4

    for (valor in values) {
        println(valor)
    }
    println("-------1----------")

    values.forEach {
        println(it)
    }
    values.forEach {valor ->
        println(valor)
    }

    println("--------2---------")
    values.sort()
 for (index in values.indices){
     println(values[index])
 }
    println("--------3---------"+ values.size)
}