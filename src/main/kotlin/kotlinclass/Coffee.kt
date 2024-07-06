package kotlinclass

fun main() {
    val coffee = Coffee("아이스 아메리카노", 2000, "스타벅스", true);
    println("${coffee.brand} ${coffee.name} 가격은 ${coffee.price} 입니다.")
    println()

    val coffee2 = Coffee2()
    // setter
    coffee2.name = "아이스 라떼"
    coffee2.price = 3000
    coffee2.brand = "이디야"
    coffee2.isCold = true

    // getter
    println("${coffee2.brand} ${coffee2.name} 가격은 ${coffee2.price} 입니다.")
    println()

    val coffee3 = Coffee3()
    coffee3.name = "아메리카노"
    coffee3.price = 2000
    coffee3.brand = "까페베네"
    coffee3.isCold = false
    println("${coffee3.brand} ${coffee3.name} 가격은 ${coffee3.price} 입니다.")

}

// class 키워드를 사용하여 클래스를 선언
// 코틀린에선 클래스에 프로퍼티를 선언할때 후행 쉼표 trailing comma 를 사용할 수 있다
// 후행 쉼표를 쓰면 이전의 마지막 줄을 수정하지 않고 프로퍼티를 쉽게 추가할 수 있고 git에서 diff 등으로 코드를 비교했을때 변경사항을 명확히 알 수 있다.

// val로 선언된 프로퍼티는 getter만 존재한다
class Coffee (
    val name : String,
    val price : Int,
    val brand : String,
    val isCold : Boolean,
) {

}


// 코틀린은 var로 선언된 프로퍼티는 getter, setter 를 자동으로 생성한다
class Coffee2 (
    var name : String = "",
    var price : Int = 0,
) {
    // var로 선언된 프로퍼티에 한하여 커스텀 setter를 만들 수 있다
    // 코틀린은 getter, setter에서 field 라는 식별자를 사용해 필드의 참조에 접근하는 데 이를 Backing Field 에 접근
    var brand: String = ""
        set(value) {
            field = value
        }

        get() {
            return field
        }

    // Backing Field가 필요한 이유가 무엇일까?
    // 코틀린에서 프로퍼티에 값을 할당할때 실제론 setter를 사용하는데 이때 무한 재귀 즉 StackOverflow가 발생할 수 있다
    var isCold: Boolean = true
        set(value) { // 커스텀 setter
            field = value
        }
}


class Coffee3 {
    lateinit var name : String
    var price : Int = 0
    lateinit var brand: String
    var isCold: Boolean = false
}