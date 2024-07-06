package extends

/**
* - 코틀린은 `abstract` 키워드를 사용해 추상클래스도 제공한다
* - 이때 하위 클래스에서 구현해야하는 프로퍼티나 함수 또한 abstract 키워드를 사용한다
*/

abstract class Developer {
    abstract var age: Int
    abstract fun code(language: String)
}

class BackendDeveloper(override var age: Int) : Developer() {
    override fun code(language: String) {
        println("My Develop Language is ${language}")
    }
}


fun main() {
    val backendDeveloper = BackendDeveloper(38)
    println(backendDeveloper.age)
    backendDeveloper.code("Java & Kotlin")
}