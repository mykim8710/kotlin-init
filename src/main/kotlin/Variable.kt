// 탑레벨에 변수 선언가능(함수, 클래스 바깥)
var x = 5

fun main() {
    x += 1
    println(x)


    // 키워드 변수명 : 타입 = 값
    var a : Int = 1
    var b = 2 // 타입생략 가능

    var str : String = "String"

    // 지연할당
    var c : Int // 변수선언 : 지연할당 시 변수의 타입을 선언하지 않으면 컴파일 오류 발생
    c = 3   // 값 할당

    /**
     * 키워드
     * var(variable) : 가변변수, 재할당 가능(타입변경은 불가)
     * val(value) : == 자바의 final, 한번 값을 초기화하면 재할당 X, readonly
     */

}