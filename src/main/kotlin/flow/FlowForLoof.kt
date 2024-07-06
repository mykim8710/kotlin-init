package flow

fun main() {
    // 기본적으로 자바의 foreach와 유사
    // 범위 연산자 .. 를 사용해 for loop 돌리기
    for (i in 0..3) {
        println(i)
    }
    println()

    // until 을 사용해 반복한다
    // 뒤에 온 숫자는 포함하지 않는다
    for (i in 0 until 3) {
        println(i)
    }
    println()

    // step 에 들어온 값 만큼 증가
    for (i in 0..6 step 2) {
        println(i)
    }
    println()

    // downTo를 사용해 반복하면서 값을 감소
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
    println()

    // 전달받은 배열을 반복
    var numbers = arrayOf(0, 1, 2, 3)
    for (i in numbers) {
        println(i)
    }
}