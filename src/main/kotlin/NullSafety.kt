fun main() {
    /**
     * 자바의 Optional은 값을 래핑하기 때문에 객체 생성에 따른 오버헤드가 발생하고, 컴파일 단계에서 Null 가능성을 검사하지 않음
     * 코틀린을 비롯한 최신 언어에선 널 가능성을 컴파일러가 미리 감지해서 NPE 가능성을 줄일 수 있다.
     * 코틀린은 언어적 차원에서 NPE가 발생할 가능성을 제거
     *
     */

    // 코틑린의 타입은 기본적으로 Non-Null 타입이므로 null을 허용하지 않음
    // 컴파일 오류
    /*val a : String = null
    var b : String = "aabbcc"
    b = null*/


    // 코틀린은 null을 허용하는 `Nullable` 타입을 제공
    // Nullable 참조는 컴파일 단계에서 널 안정성을 제공
    var str : String? = null
    //str.length   // 컴파일 오류
    //str?.length  // Nullable 참조에 대한 접근은 안전 연산자를 사용


    // 엘비스 연산자를 사용해 null이 아닌 경우 특정 값을 사용하도록 함
    var c : Int = if (str != null) str.length else 0
    println(c)

    // 엘비스 연산자를 사용하면 좌변이 null인 경우 우변을 리턴
    val d = str?.length ?: 0
    println(d)



    // 코틀린에서도 NPE가 발생할 수 있음
    // 명시적 NPE 호출
    // throw NullPointerException()

    // !! NotNull임을 단언하는 단언 연산자를 사용
    val a1: String? = null
    val a2 = a1!!.length

    // 이 외에도 자바와 상호운용하는 경우 자바에서 NPE를 유발하는 코드를 코틀린에서 사용하면 NPE가 발생할 수 있다
    println(JavaNullSafety.getNullStr().length)


    // 코틀린에서 자바 코드를 사용할때는 항상 Nullable 가능성을 염두해 안전 연산자와 엘비스 연산자를 사용
    println(JavaNullSafety.getNullStr()?.length)

}