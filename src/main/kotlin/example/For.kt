package example

fun main() {

    // 범위 연산자 ..를 사용해 for loop 돌리기
    for (i in 0 .. 3) {
        println(i)
    }

//    for (i in 1 .. 9) {
//        print(i)
//        print(" ")
//    }

    // until을 사용해 반복한다
    // 뒤에 온 숫자는 포함하지 않는다
    for (i in 0 until 3) {
        println(i)
    }
}