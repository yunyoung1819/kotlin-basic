package example.kotlin

/**
 * Data Class
 */
data class Person(val name: String, val age: Int) {

}

fun main() {
    val person1 = Person(name = "Jang Won Young", age = 19)

//    val set = hashSetOf(person1)
//    println(set.contains(person1))

//    person1.name = "Yu Jin"
//    println(set.contains(person1))

//    val person2 = person1.copy(name = "Yu Jin")
//    println(person2)

    val (name, age) = person1

    println("이름=${name}, 나이=${age}")
}