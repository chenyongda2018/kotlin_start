fun main() {

    val x = 2
    val y = 3
    var max = if (x > y) x else y
    var min = if (x < y) x else y
    println(upperCaseString("haha"))
    println(upperCaseString(22))


}

fun upperCaseString(str : Any) : String? {
    if(str is String) {
        return str.toUpperCase()
    }
    return null
}