package luscasrd.api.collections

fun main() {
    val joao = Funcionario("Joao", 8000.0, "CLT")
    val pedro = Funcionario("Pedro", 2800.0, "PJ")
    val maria = Funcionario("Maria", 5000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)
    val funcionarios3 = setOf(joao, pedro, maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("-----------------")

    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("-----------------")

    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}