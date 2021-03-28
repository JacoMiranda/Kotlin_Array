package one.innovation.array

fun main() {
    val salarios= DoubleArray(3)

    salarios[0]= 1000.00 //atribuindo valores ao array
    salarios[1]= 3000.00
    salarios[2]= 2500.00

    salarios.forEach { println(it) } // iterando o array de salarios
    println("_________")

    /* Para cada salário dá um aumento de 10% (1.1)
    * o forEachIndexed percorre cada indice atribuindo
    * o cálculo especificado usando a expressão lambida
    * */
    salarios.forEachIndexed{ index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it)  }
    println("_____________________")

    //Outra forma de criar array de double

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5200.0)
    salarios2.sort() //ordena o array
    salarios2.forEach { println(it) }
}
