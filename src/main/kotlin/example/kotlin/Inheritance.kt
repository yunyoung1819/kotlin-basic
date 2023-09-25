package example.kotlin

open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("멍멍!!")
    }
}

open class Bulldog(override var age : Int = 0) : Dog() {

    override fun bark() {
        super.bark()
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

abstract class Developer {

    abstract var age: Int
    abstract fun code(language: String)

}

class BackendDeveloper(override var age: Int) : Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }
}

fun main() {
    val dog = Bulldog(age = 2)
    println(dog.age)
    dog.bark()

    val cat = WildCat(age = 1)
    println(cat.age)
    cat.bark()

    val backendDeveloper = BackendDeveloper(age = 20)
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")
}