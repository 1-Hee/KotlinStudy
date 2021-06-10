package `87_ex_extention_property`

//chap 87. 확장프로퍼티

// 문자열이 큰지 판단하는 확장 프로퍼티
val String.isLarge:Boolean // 확장프로퍼티도 확장 함수처럼 프로퍼티 이름 앞에 리시버 타입을 적는다.
    get() = this.length >= 10 // 문자열의 길이가 10 이상이면 큰 것으로 간주했다.

fun main(args:Array<String>)
{
    println("1234567892".isLarge) // isLargs는 프로퍼티이므로 소괄호"()" 를 쓰지 않는다.
    println("500원".isLarge)
}