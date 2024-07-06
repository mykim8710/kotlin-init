package function// 기본적인 함수 선언 스타일

// fun 함수명(함수인자) : return type {}
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 표현식 스타일(함수 본문없이)
fun sum2(a: Int, b: Int): Int = a + b

// 반환 타입이 없어도 컴파일러가 분석하여 적절한 타입을 추론
fun sum3(a: Int, b: Int) = a + b

// 중괄호가 있는 경우에는 생략이 불가능(컴파일 오류)
/*fun sum4(a: Int, b: Int) {
    return a + b
}*/

// 반환형이 없는 경우 Unit이 반환 타입(Unit은 생략 가능 == java void)
fun printSum(a: Int, b: Int): Unit {
    println("$a 더하기 $b = ${a + b}")
}

// default 파라미터
// 자바는 디폴트 파라미터 기능이 없다
fun greeting(message:String = "안녕하세요!!") {
    println(message)
}

// 네임드 아규먼트
fun log(level: String = "INFO", message: String) {
    println("[$level]$message")
}

fun main () {
    // default 파라미터
    greeting()               // 안녕하세요!!
    greeting("Hello, World") // Hello, World
    println()

    // 네임드 아규먼트(mapping)
    log(message = "인포 로그")
    log(level = "DEBUG", "디버그 로그")
    log("WARN", "워닝 로그")
    log(level = "ERROR", message = "에러 로그")
}