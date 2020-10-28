object MyObject {
    fun method() {
        println("myObject")
    }
}

/**
 * 伴生对象的作用为类提供静态成员（变量、方法）,在运行期间的java代码中，伴生对象实际上是外部类
 * 的静态内部类。
 */
class MyTest {
    companion object Test {
        var i = 100

        /**
         * 当没有使用@JvmStatic注解时，在运行期间,method()方法是
         * 静态内部类Test的成员方法,调用时会通过Test变量调用
         */
        fun method() {
            println("test")
        }

        /**
         * 当@JvmStatic注解时,在运行期间,method()方法编译成了外部类MyTest的静态方法
         */
        @JvmStatic
        fun method2() {
            println("xasda")
        }

    }
}

fun main() {
    MyObject.method()
    println(MyTest.i)
    MyTest.method()
}