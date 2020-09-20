fun main() {
//    testWith()
//    testApply()
//    testConstruct()
    testCon() 



}


class Turtle{

    var num: Int = 10


    fun add(a: Int) {
        num += a
    }

    fun minus(a: Int) {
        num -= a
    }
}

fun testWith() {
    var myTurtle  = Turtle();
    with(myTurtle) {
        add(2)
        minus(10)
    }
    print(myTurtle.num)
}

fun testApply() {
    var turtle = Turtle().apply {
        num = 20
    }
    print(turtle.num)
}

class Dog(name : String) {
    init {
        println("Hello , i am $name. -initial")
    }
}
fun testConstruct() {
    var dog = Dog("NIUBI")

}

class Animal (var name : String = "cat" , var age : Int = 14) {
    init {
        println("$name is a animal ,the age is $age")
    }
}

fun testCon() {
    var a  = Animal()
    print(a)
}