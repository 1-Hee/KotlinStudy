package `74_ex_nothing_type`

import java.lang.Exception

//chap 74. nothing 타입

fun throwing():Nothing = throw Exception()

fun main(args:Array<String>)
{
    println("start")
    val i : Int = throwing()
    println(i)
}

// nothing 타입은 실행 흐름이 도달할 수없는 구역을 나타내기 위한 특수 타입이다.
// Int 타입의 변수에 Nothing 타입의 표현식을 대입했다.
// Nothing 타입은 어떠한 타입과도 호환되기 때문에 이런 코드가 가능하다.
// Int 타입에 Nothing 타입을 대입한다고 해도 throwing 함수가 호출되면 곧바로 예외가 던져져 프로그램이 강제종료 되므로 문제되지 않는다
// Nothing은 어떤상황에서 활용이 가능할까?

//fun validate(num:Int)
//{
//    val result : Int =
//        if(num >= 0 ) num
//        else throw Exception("num이 음수입니다.")
//}
//  26번줄은 Nothing 타입의 표현식이기 때문에 if-else 블록이 Int 타입의 표현식으로 인식된다.
// 만약 throw Exception 부분이 표현식이 아니었따면, else 블록의 타입이 Unit이 되어버리므로 if-else를 표현식으로 쓸수 없게 된다.
// Nothing은 thorw를 표현식으로 슬 수 있게 하기 위한 장치이다.