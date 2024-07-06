package implements

// 코틑린의 인터페이스는 interface 키워드를 사용해 정의할 수 있다
// 코틀린의 인터페이스 내부에는 추상 함수와 자바 8의 디폴트 메서드 처럼 구현을 가진 함수를 모두 정의할 수 있다
class Product(val name: String, val price: Int)


// 코틀린 인터페이스는 상위 인터페이스를 가질 수 있다
interface Wheel {
    fun roll()
}

interface Cart : Wheel {
    // 코틀린의 인터페이스는 프로퍼티가 존재할 수 있다
    var coin: Int
    val weight: String
        get() = "20KG"

    fun add(product: Product)

    fun rent() {
        if(coin > 0) {
            println("카트를 대여합니다")
        }
    }

    override fun roll() {
        println("카트가 굴러갑니다")
    }
}

// 클래스는 하나 이상의 인터페이스를 구현할 수 있다 Order엔 add가 구현이 있는 디폴트 함수이고 Cart는 abstract 함수이다
// 이때 동일한 시그니처를 가진 함수가 있는 경우 `super<인터페이스>` 를 사용해 호출할 수 있다
interface Order {
    fun add(product: Product) {
        println("${product.name} 주문이 완료되었습니다.")
    }
}

// 클래스에서 인터페이스를 구현할때는 `:` 을 붙이고 인터페이스의 이름을 적는다
// 상속과 다른 점은 `()` 생성자 호출이 없다는 것이다
// 두 인터페이스에 구현을 가진 동일한 디폴트 함수를 사용할 경우 >> 컴파일 오류
class MyCart(override var coin: Int) : Cart, Order {
    override fun add(product: Product) {
        if (coin <= 0) {
            println("코인을 넣어주세요")
        } else {
            println("${product.name}이(가) 카트에 추가됐습니다")

            // 주문
            super<Order>.add(product)
        }
    }
}


fun main() {
    val cart = MyCart(coin = 1000)
    cart.rent()
    cart.roll()
    cart.add(Product(name = "노트북", price = 1000))
}





















