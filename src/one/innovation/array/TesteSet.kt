package one.innovation.array

fun main() {
    val joao = Funcionario( "João", 1800.0, "CLT")
    val jose = Funcionario( "José", 1500.0, "PJ")
    val maria = Funcionario( "Maria", 2000.0, "PJ")

    val funcionarios1 = setOf(joao, jose) //conjunto de funcionarios
    val funcionarios2 = setOf( maria) //conjunto de funcionarios
    val funcionarios3 = setOf(joao, jose, maria) //conjunto de funcionarios

    val resultUnion =funcionarios1.union(funcionarios2)
        resultUnion.forEach{ println(it)}

    println("______ subtraindo um conjunto__________")
    val resultSubtract =funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it)}

    println("______ interseção de conjuntos__________")
    val resultSIntersect =funcionarios3.intersect(funcionarios2)
    resultSIntersect.forEach{ println(it)}
}