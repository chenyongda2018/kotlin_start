/**
 * kotlin的可见性修饰符
 * private:当前类可见
 * protected:子类可见
 * internal:当前module可见
 * public(默认):所有可见
 */
fun main() {
    var test = Test10()
    println(test.add(1, 1))
    println(test.multiply(2, 3))
}


class Test10 {

    fun add(a: Int, b: Int) = a + b;

}

fun Test10.multiply(a: Int, b: Int) = a * b
/**
 * 对一个类进行拓展，添加新的方法
 * 注意:拓展函数的解析是静态的
 * 1.拓展本身并不会真正修改目标类,也就是说并不会在这个类中插入新的属性和方法.
 * 2.拓展函数的解析是静态的，即不支持多态，由对象的声明类型指定.
 */
open class TestA

class TestB:TestA()

fun TestA.a() = "a"
fun TestB.a() = "b"

/**
 * 即使这里传入TestB类，调用的也是TestA.a()，即拓展不支持多态
 */
fun printTest(a: TestA) {
    println(a.a())
}

