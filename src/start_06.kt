open class Parent(var name: String,var age: Int) {
    open fun method() {
        println("parent method")
    }
}

class Child(name: String,age: Int,var school: String):Parent(name,age) {
    
}

interface MyInterface {
    fun method() {
        println("www")
    }
}

open class B {
    open fun method() {
        println("bbb")
    }
}

/**
 * 当接口和父类中有相同的方法时，实现类必须override此方法
 */
class A: B(),MyInterface {

    override fun method() {
        super<MyInterface>.method()
        super<B>.method()
        println("child")
    }
}

fun main() {
    var a = A()
    a.method()
}