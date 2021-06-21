package `112_ex_reified_type_parameter`

// chap 112. 구체화된(Reified) 타입 매개변수
// 타입 매개변수는 대부분 상황에서 일반 타입처럼 쓸 수 있지만, 특정 상황에서는 그렇지 못하다.
// 다음 코드는 오류를 일으킨다.

// 타입 매개변수는 is 연산자의 피연산자로 사용할 수 없다.
// 타입 매개변수를 is 연산자의 피연산자로 사용하고 싶으면 다음과 같이 해야 한다.

inline fun <reified T> check() // 타입 매개변수 앞에 reified를 붙여주면 해당 타입 매개변수를 in 연산자에 사용할 수 있다.
// 타입 매개변수에 reified를 붙이려면 함수를 반드시 inline으로 선언해야 한다.
// check 함수를 호출하고 있다.

{
    val number = 0
    if (number is T)
        println("T는 Int 타입입니다.")
}

fun main(args:Array<String>)
{
    check<Int>() // check 함수를 호출하고 있다.
}