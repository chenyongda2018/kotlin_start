package chapter_1_class

/**
 * tips1 : 类中的成员变量和init代码块会按照在代码中的先后顺序初始化
 */
class Person constructor(name: String) {
    var firstStr = "the first property is $name".also { println(it) }

    init {
        println("the first init block prints $name")
    }

    var secondStr = "the sec str property ".also { println(it) }

    init {
        println("the sec init block")
    }
}

fun main() {
    Person("cat")
    val ay = intArrayOf(1,2,3);
    ay.size
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun add2(a: Int,b :Int) = a + b

fun p(a :Int,b :Int) {
    print(a + b)
}

