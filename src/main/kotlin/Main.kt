import java.lang.UnsupportedOperationException

fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val operation = readln().single()
    calculate(num1, num2, operation) { println("Result for operation $operation = $it") }
}

fun calculate(num1: Int, num2: Int, op: Char, finisher: (Int) -> Unit) {
    when (op) {
        '+' -> finisher(num1.plus(num2))
        '-' -> finisher(num1.minus(num2))
        '/' -> finisher(num1 / num2)
        '*' -> finisher(num1 * num2)
        else -> throw UnsupportedOperationException()
    }
}