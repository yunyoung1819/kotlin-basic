package example

var x = 5

fun main() {

    val a : Int = 1

    val b = 1

    val c : Int
    c = 3

    val d : Int
    d = 123

//  val(value): val은 초기화 이후 재할당이 불가능
//  var(variable): var는 초기화 이후에도 값 재할당이 가능
    var e : String = "Hello"
    e = "Word"

//  var f = 123
//  f = "hi"

    x += 1
    println(x)
}