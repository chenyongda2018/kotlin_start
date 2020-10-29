
class Test08 {

    lateinit var name: String;
//    lateinit var age: Int;

    fun init() {
        name = "test"
    }
}

/**
 * lateinit
 * 1. 用于延迟初始化属性的值,但是在调用此属性之前,必须要赋值
 * 2. 只能用于类体中，不能用于构造方法中,且属性类型不能是基本数据类型.
 * 3. 属性不能有自定义的getter/setter方法
 * 4. 属性必须是非空类型
 */
fun main() {
    var test = Test08()
    test.name
}