

class CompanionTest {
    companion object MyObject {}
}
//拓展伴生对象
fun CompanionTest.MyObject.method() {
    println("companion method")
}

fun main() {
    CompanionTest.method()
}

class DD {
    fun method() {
        println("dd method")
    }

    var d = DD()
//    d.hello() 此处不能调用在EE中对DD的拓展方法

}

/**
 * 拓展的作用域:
 * 1.拓展函数所定义在的类叫做 分发接收者
 * 2.拓展函数所拓展的类叫做 拓展接收者
 * 3.当在分发接收者中调用拓展接收者的同名函数时，拓展接收者优先分发接收者
 *
 * 拓展的作用:
 * 可以很好的解决java中各种辅助类的问题
 * 在不改变类的情况下，拓展类的功能.
 * 如Collections.sort(list,i,j) 可以替换成 list.sort(i,j)
 */
class EE {

    fun DD.hello() {
        method() //可以调用DD类中的方法
        println("hello")
    }

    fun DD.print() {
        this.toString();//此处会触发DD类的toString()
        this@EE.toString();//出发EE类的toString()
    }

    fun dd(d:DD) {
        d.method()
        d.hello()
        d.print()
    }
}