/**
 * sealed class 密封类,类似一种枚举的作用
 * 强调类型之间的层次关系
 * 密封类的直接子类需要与密封类定义在同一文件中,间接子类可以定义在任意文件中
 */
sealed class Calculator

class Add : Calculator()

class Subtract : Calculator()


fun calculate(a: Int, b: Int, cal: Calculator) = when (cal) {
    is Add -> a + b
    is Subtract -> a - b
}

fun main() {
    println(calculate(1, 2, Add()))
    println(calculate(2, 2, Subtract()))
}
