package exception

/**
 * 코틀린의 모든 예외 클래스는 최상위 예외 클래스인 Throwable을 상속
 * Error : 시스템에 비정상적인 상황이 발생. 예측이 어렵고 기본적으로 복구가 불가능 함
 *   ex) OutOfMemoryError, StackOverflowError, etc ...
 *
 * Exception(Checked Exception) : 시스템에서 포착 가능하여(try-catch) 복구 가능. 예외 처리 강제
 *   ex) IOException, FileNotFoundException, etc ...
 *   @Transactional 에서 해당 예외가 발생하면 기본적으론 롤백이 동작하지 않음
 *   rollbackFor를 사용해야함
 *
 * RuntimeException(unChecked Exception) : 런타임시에 발생하는 예외. 예외 처리를 강제하지 않음
 *   ex) NullPointerException, ArrayIndexOutOfBoundsException ...
 *
 * 코틀린에서는 자바의 Exception 계층을 코틀린 패키지로 래핑
 */

fun main() {

    // 코틀린은 Checked Exception을 강제하지 않는다
    // 코틀린에서 컴파일 오류가 발생하지 않는다(Java에서는 발생)
    Thread.sleep(1);

    // 원하는 경우에는 try-catch를 쓸 수 있다
    try {
        Thread.sleep(1);
    } catch (e: Exception) {
        // 예외처리
        // ....
    }

    // 코틀린의 try-catch는 표현식

    val a = try {
        "1234".toInt()
    } catch (e: NumberFormatException) {
        println("catch 동작")
    }
    println(a)
    println()


    // finally 를 사용하면 try-catch의 마지막에 수행될 코드를 작성할 수 있다
    try {
        throw Exception()
    } catch (e: Exception) {
        println("catch 수행!")
    } finally {
        println("finally 수행!")
    }

    // 코틀린에서 Exception을 발생시키려면 throw를 사용
    // throw Exception("예외 발생!")

    // throw 역시 표현식이기 때문에 throw를 리턴할 수 있다
    //failFast("에러발생!")

    // Nothing 타입을 사용하면 컴파일러는 해당 코드 이후는 실행되지 않는 다는 경고를 보여준다
    // Unreachable code
    //println("이 메시지는 출력될까?")


    // 엘비스 연산자와 사용하면 null 안전 코드를 작성하지 않아도 된다
    val aa: String? = null
    val bb: String = aa ?: failFast("aa is null ")
    println(bb.length)
}

fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}
