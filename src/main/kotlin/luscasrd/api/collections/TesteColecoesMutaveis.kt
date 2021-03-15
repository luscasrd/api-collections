package luscasrd.api.collections

fun main() {
    val joao = Funcionario( "Joao", 8000.0, "CLT")
    val pedro = Funcionario( "Pedro", 2800.0, "PJ")
    val maria = Funcionario( "Maria", 5000.0, "CLT")

    println("-------- List ---------")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it)}

    println("-----------------")

    funcionarios.add(pedro)
    funcionarios.forEach{ println(it)}

    println("-----------------")

    funcionarios.remove(joao)
    funcionarios.forEach{ println(it)}

    println("-------- Set ---------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }
    println("-----------------")

    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("-----------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach{ println(it)}
}