class Generic<T> (t : T) {
    var varable : T

    init {
        varable = t
    }
}

fun main() {
    var generic = Generic("cyd")
    println(generic.varable)
}

