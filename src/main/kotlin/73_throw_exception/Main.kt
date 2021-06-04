package `73_throw_exception`

import java.lang.Exception

//chap 73. 예외 던지기
// 예외는 기본적으로 시스템에 의해 일어나지만, 우리가 고의로 예외를 발생시킬 수도 있다. 이렇게 예외를 발생시키는 것을
// "예외를 던진다" 라고 표현한다.

fun main(args:Array<String>){

    try {
        something()
    }
    catch (e:Exception)
    {
        println(e.message)
    }
}

fun something() {
    val num1 = 10
    val num2 = 0
    div(num1, num2)
}

fun div(a: Int, b: Int): Int {

    if( b == 0 )
        throw Exception("0으로 나눌 수 없습니다")
    return a / b
}

// 코틀린의 throws 키워드
// 코틀린에는 throws 키워드가 없다. 코틀린 함수는 자바처럼 메서드 선언에 예외 정보를 포함하지 않는다.
// 왜그럴까? 알다시피 자바에선, throws 가 있는 함수를 호출할 때마다 매번 함수 호출을 try-catch 블록으로 감싸야만 한다.
// 하지만, 간결함을 중시한느 코틀린에서는 이런 지저분한 코드를 용납할 수 없었꼬, 결국 과감히 throws 코드를 제거해버렸다.
// 코틀린에서의 예외처리는 이제 필수가 아닌 옵션이다.
