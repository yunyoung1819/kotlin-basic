fun main() {

    // if... else 사용
    val job = "Software Engineer";

    if (job == "Software Engineer") {
        println("소프트웨어 개발자")
    } else {
        println("소프트웨어 개발자가 아니다")
    }

    // 코틀린의 if... else는 표현식이다
    val age : Int = 19
    var str = if (age > 19) {
        "성인"
    } else {
        "아이"
    }
    println(str);

    // 코틀린은 삼항 연산자가 없다. if.. else가 표현식이므로 불필요하다
    val a = 1
    val b = 2
    val c = if (b > a) b else a

    val money : Int = 100000
    val price = if (money > 99000) {
        "비쌈"
    } else {
        "저렴"
    }
    println(price)
}