/**
 * 每个属性都有一个backing field,(支撑字段)
 * 存储属性的值
 */
class Ab(name: String, address: String) {

    val age: Int
        get() = 20
    var name = name
       get() {
           println("cyd")
           return field
       }
       set(value) {
           val str : String = value + "cyd"
           field = str
       }
}

fun main() {

}