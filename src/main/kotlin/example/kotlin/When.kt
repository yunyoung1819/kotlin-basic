package example.kotlin

fun main() {
    // 자바 코드를 코틀린의 when 식으로 변환한 코드
    val day = 2

    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        else -> "기타"
    }
    println(result)

    // else를 생략할 수 있다
    when(getColor()) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
    }

    // 여러개의 조건을 콤마로 구분해 한줄에서 정의할 수 있다
    when (getNumber()) {
        0, 1 -> println("0 또는 1")
        else -> println("0 또는 1이 아님")
    }

    when (getArtist()) {
        "KimChaeWon" -> println("아이즈원 또는 르세라핌")
        "JangWonYoung" -> println("아이즈원 또는 아이브")
        else -> println("아이즈원")
    }
}

enum class Color {
    RED, GREEN
}

fun getColor() = Color.RED

fun getNumber() = 2

fun getArtist () = "JangWonYoung"