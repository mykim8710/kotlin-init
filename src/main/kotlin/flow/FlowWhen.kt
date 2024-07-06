package flow

fun main() {
    // When
    /**
     * when (대상변수) {
     * 	 조건 -> 참인 경우 실행
     * 	 조건 -> 참인 경우 실행
     * 	 조건 -> 참인 경우 실행
     *   else -> 참인 조건이 없을 경우 실행
     * }
     */

    // 자바의 switch문과 유사
    val day = 2

    when (day) {
        1 -> println("월요일")
        2 -> println("화요일")
        3 -> println("수요일")
        4 -> println("목요일")
        5 -> println("금요일")
        6 -> println("토요일")
        7 -> println("일요일")
        else -> println("에러")
    }

    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        5 -> "금요일"
        6 -> "토요일"
        7 -> "일요일"
        else -> "에러"
    }

    println(result)


    // else를 생략할 수 있다
    when(getRedColor()) {
        Color.RED -> println("Red")
        Color.GREEN -> println("Green")
        Color.BLUE -> println("Blue")
    }


    // 여러개의 조건을 콤마로 구분해 한줄에서 정의할 수 있다
    when(getNumber()) {
        0, 1 -> println("0 또는 1")
        else -> println("0 또는 1이 아님")
    }
}

enum class Color {
    RED, GREEN, BLUE
}
fun getRedColor() = Color.RED

fun getNumber() : Int= 2

