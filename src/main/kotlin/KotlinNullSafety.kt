fun main() {
    val nullableStr = getNullStr()

    // val nullableStr = getNullStr() ?: "null인 경우 반환" 아래의 null 가능성이 제거됨
    // println(nullableStr)

    // val nullableStrLength = nullableStr.length // 컴파일 오류
    val nullableStrLength = nullableStr?.length // 컴파일 오류
    println(nullableStrLength)

    println(getLengthIfNotNull(null))
}

fun getNullStr(): String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0
