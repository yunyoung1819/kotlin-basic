package example.kotlin

open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("멍멍!!")
    }
}

class Bulldog(override var age : Int = 0) : Dog() {

    override fun bark() {
        println("컹컹!!")
    }
}

open class Cat {
    open var age: Int = 0

    open fun bark() {
        println("야옹!!")
    }
}


class WildCat(override var age : Int = 0) : Cat() {

    override fun bark() {
        println("어흥!!")
    }
}

fun main() {
    val dog = Bulldog(age = 2)
    println(dog.age)
    dog.bark()

    val cat = WildCat(age = 1)
    println(cat.age)
    cat.bark()
}