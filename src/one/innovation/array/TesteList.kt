package one.innovation.array

fun main() {
     val joao = Funcionario( "João", 1800.0, "CLT")
    val jose = Funcionario( "José", 1500.0, "PJ")
    val maria = Funcionario( "Maria", 2000.0, "PJ")

    val funcionarios = listOf(joao, jose, maria)

    funcionarios.forEach{ println(it)}
    println("______________fazer uma busca por nome com find________________________")
    println(funcionarios.find { it.nome == "Maria" })

    println("______________coletar por salários ordenados usando sortedBy________________________")
    funcionarios
            .sortedBy { it.salario }//ordena por salário em ordem decrescente
            .forEach{println(it)}

    println("______________coletar por salários ordenados usando groupBy________________________")
    //para isso temos que acrescentar um tipo de contrato para o funcionario para fazermos a busca por exemplo por CLT ou PJ
    funcionarios
            .groupBy { it.tipoContrato }//agrupa por tipo de contrataçãoem ordem decrescente
            .forEach{println(it)}//imprime o resultado obtido

    funcionarios.
}

data class Funcionario (
        val nome : String,
        val salario: Double,
        val tipoContrato: String
        ){
    override fun toString(): String =
            """
                nome:$nome
                salario:$salario           
               
            """.trimIndent()

}
