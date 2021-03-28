package one.innovation.array

import java.util.*

fun main() {

    val salarios = doubleArrayOf(1000.00, 2250.00, 4000.0)

    for (salario in salarios){
        println(salario)
    }
    println("-----Max-Min-Média------")
    println("Maior salario: ${salarios.max()}")

    println("Menor salario: ${salarios.min()}")

    println("Média salarial: ${salarios.average()}")

    println("------------")
    println("Salário maior que 2500, usando filter")
    val salarioMaiorQue2500 = salarios.filter { it > 2500 }

    salarioMaiorQue2500.forEach{println(it)}

    println("------count------")
    println("Quantos salários estão entre 2000 a 5000")
    println(salarios.count{ it in 2000.0..5000.0})

    println("------------any------------")
    println("Salário igual a 2500.00")
    println(salarios.find { it == 2250.0 })

    println("Salário igual a 500.00, vai retornar null pois não existe no array")
    println("Resposta:  ${salarios.find { it == 500.0 }}")

println("------------any------------")
    println("Procurando qualquer valor(500.0) na coleção, retorna true ou false")
    println("Resposta:  ${salarios.any { it == 500.0 }}")

    println("Procurando qualquer valor(4000.0) na coleção, retorna true ou false")
    println("Resposta:  ${salarios.any { it == 4000.0 }} , " + "valor:"
            + salarios.find{it == 4000.0})
}

