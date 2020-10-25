fun main() {
    var a = intArrayOf(1,2,3,4,45,11)
    for(i : Int in a.indices) {
        println("array[$i]  = ${a[i]}")
    }

    println("-------")

    for((index,value) in a.withIndex()) {
        println("a[$index] = $value")
    }

    println("-------")


}

