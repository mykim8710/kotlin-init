package enums

// 코틀린은 서로 연관된 상수들의 집합을 enum class 를 사용해서 정의할 수 있다


enum class PaymentStatus {
    UNPAID, PAID, FAILED, REFUNDED
}

enum class PaymentStatus2(val label : String) {
    // 각각의 결제 상태에 따라 `isPayable` 상태를 다르게 구현하려한다
    // abstract 함수를 가질 수 있고 각각의 상수는 익명 클래스형태로 abstract 함수를 구현할 수 있다

    UNPAID("미지급") {
        override fun isPayable(): Boolean {
            return true
        }
    },
    PAID("지급완료") {
        override fun isPayable(): Boolean {
            return false
        }
    },
    FAILED("지급실패") {
        override fun isPayable(): Boolean {
            return false
        }
    },
    REFUNDED("환불") {
        override fun isPayable(): Boolean {
            return false
        }
    },

    ;

    abstract fun isPayable(): Boolean
}

// enum 클래스에서 인터페이스를 구현할 수 있다
interface Payable {
    fun isPayable(): Boolean
}

enum class PaymentStatus3(val label : String) : Payable {
    // 각각의 결제 상태에 따라 `isPayable` 상태를 다르게 구현하려한다
    // abstract 함수를 가질 수 있고 각각의 상수는 익명 클래스형태로 abstract 함수를 구현할 수 있다

    UNPAID("미지급") {
        override fun isPayable(): Boolean {
            return true
        }
    },
    PAID("지급완료") {
        override fun isPayable(): Boolean {
            return false
        }
    },
    FAILED("지급실패") {
        override fun isPayable(): Boolean {
            return false
        }
    },
    REFUNDED("환불") {
        override fun isPayable(): Boolean {
            return false
        }
    },

    ;
}


fun main() {
    // valueOf(value:String) : String를 사용해서 enum 클래스를 생성할 수 있다
    val paymentStatus = PaymentStatus3.valueOf("PAID")
    println(paymentStatus.label)


    // enum 클래스의 동등성 비교는 == 를 사용한다
    if (paymentStatus == PaymentStatus3.PAID) {
        println("결제 완료 상태")
    }


    // enum 클래스의 상수를 나열하려면 values() : Array<EnumClass> 를 사용한다
    for (status in PaymentStatus3.values()) {
        println("[$status](${status.label})")
    }


    // 상수는 제공하는 2개의 프로퍼티를 사용해 이름을 얻거나 순서를 얻을 수 있다
    val name: String
    val ordinal: Int
    for (status in PaymentStatus3.values()) {
        println("[${status.name}](${status.label}) : ${status.ordinal}")
    }
}