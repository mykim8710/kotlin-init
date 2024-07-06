package extends

/**
 * - 자바의 모든 클래스의 조상은 Object 코틀린에서 모든 클래스의 조상은 Any
 * - Any에는 equals, hashCode, toString이 존재하고 모든 클래스로 자동 상속된다
 * - 코틀린의 클래스는 기본적으로 final 클래스와 같이 상속을 막고 꼭 필요한 경우 `open` 키워드로 상속을 허용할 수 있다
 */

open class Dog {
    // 함수나 프로퍼티를 재정의할때도 마찬가지로 open 키워드로 오버라이드에 대해 허용
    open var age : Int = 0

    open fun sound() {
        println("멍멍")
    }
}

open class BullDog() : Dog() {
    final override var age: Int = 0

    final override fun sound() {
        println("컹컹")

        // 하위 클래스에서 상위 클래스의 함수나 프로퍼티를 접근할땐 super 키워드를 사용
        super.sound()
    }
}

// override 된 함수나 프로퍼티는 기본적으로 open 되어 있으므로
// 하위 클래스에서 오버라이드를 막기 위해선 final을 앞에 붙인다
class ChildBullDog : BullDog() {
    // 컴파일 오류
    /*override var age: Int = 0
    override fun bark() {}*/
}


fun main() {
    val bullDog = BullDog()
    bullDog.age = 2
    println(bullDog.age)
    bullDog.sound()
}