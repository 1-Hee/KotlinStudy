package `109_ex_function_literal_with_receiver`

//chap 109. 리시버가 붙은 함수 리터럴
// 함수 리터럴에 리시버를 적용하여 확장 함수처럼 만들 수 있다.

fun main(args:Array<String>)
{
    //Int 리시버를 [left, right] 범위 이내로 가공하여 반환하는 확장함수
    val makeSure:Int.(left:Int, right:Int) -> Int // Int.(left:Int, right:Int) -> Int은 리시버 타입이 Int 이고, 매개변수의 타입이 (Int, Int)이며, 반환타입이 Int 인 함수 타입이다.

    makeSure = {left:Int, right:Int ->
        if (this < left) left
        else if (this > right) right
        else this
    }

    //리시버가 적용된 함수 리터럴을 만들고 있다. 람다식으로 함수 리터럴을 작성할 때는 기존과 동일하게 적으면 된다.
    // 익명 함수 형태로 함수 리터럴을 작성하고 싶다면 fun Int.(left:Int, right:Int):Int {...} 로 적으면 된다.
    // 리시버가 붙은 함수 리터럴에는 리시버를 나타내는 this 키워드를 사용할 수 있다.

    println(15.makeSure(20, 40))
    println(18.makeSure(0, 50))
    println(25.makeSure(0, 19))

    // 리시버가 적용된 함수 타입의 변수는 리시버.변수(인수)의 형태로 호출할 수 있다.
    // 15, 18, 25가 각각 범위에 맞게 가공되어 출력된다.
}