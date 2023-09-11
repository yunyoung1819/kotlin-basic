package example

fun main () {
    val number = 1
    var name = when (number) {
        1 -> "Miyawaki Sakura"
        2 -> "Kim Chea Won"
        3 -> "Jang Won Young"
        4 -> "Rei"
        5 -> "An Yu Jin"
        else -> "Kim Min Ji"
    }
    println(name)
}
