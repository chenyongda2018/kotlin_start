class Human constructor(username: String) {

    private var age: Int
    private var address: String
    private var username: String

    init {
        this.age = 0
        this.address = ""
        this.username = username
    }

    constructor(address: String, username: String) : this(username) {
        this.address = address
    }

    constructor(age: Int, address: String, username: String) : this(address, username) {
        this.age = age
    }

    fun printStr() {
        println("The human age = $age,address = $address,username = $username")
    }

}

fun main() {
    var human = Human(16, "henan", "xiao qi")
    human.printStr()
}

class Student(private val username: String, private var age: Int, private val parent: Human) {

}