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

/**
 * 对一个类进行拓展，添加新的方法
 */
fun Test10.multiply(a: Int, b: Int) = a * b;

