fun main() {
    println(printHello("hello"))

    for(i in 10 downTo 2 step 4) {
        println(i)
    }


    var list = mutableListOf<String>("hello", "hello world", "goodbye", "chenyongda","is" ,"dog")
//    for ((index,valua) in list.withIndex()) {
//        if(valua.length == 5) {
//            var i = valua.toUpperCase()
//            list[index] = i.
//        }
//    }
//
    list.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach{ println(it)}
    println(list)
}

fun printHello(str: String) = when (str) {
    "hello" -> "HELLO"
    "world" -> "WORLD"
    else -> "other"
}

