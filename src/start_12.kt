/**
 * 数据类data class
 * data class的主构造方法至少有一个参数
 * 当为每个参数设置默认值时，创建对象时可以使用无参构造。
 */
data class Person(val name: String, var age: Int, var address: String)

fun main() {
    var person = Person("cyd", 13, "beijingshi")
    //用法1,copy(field = ..),返回一个改变了指定参数的对象
    var p2 = person.copy(name = "xiaoqi");
    println(person)
    println(p2)

    /**
     * 用法2,解构,data class默认为主构造方法中的参数提供
     * 了componentN方法,用于获取第n个属性的值
     */
    var (name,age,address) = person
    println("$name  $age  $address")
}