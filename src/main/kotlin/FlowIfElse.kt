fun main() {
    // if else
    val job = "개발자"

    if (job == "개발자") {
        println("개발자임")
    } else {
        println("개발자아님")
    }

    // 코틀린의 if...else는 표현식
    // `표현식` 또는 `식`은 그 자체로 값을 만들어 낼 수 있는 문법을 말한다
    // `구문` 또는 `문`은 그 자체로 값을 만들지 못한다
    val age : Int = 18

    val str = if (age > 18) {
        "성인"
    } else {
        "아이"
    }

    println(str)


    // 코틀린은 삼항 연산자가 없다. if..else가 표현식이므로 불필요하다
    val a = 1
    val b = 2
    val c = if (b > a) b else a
}