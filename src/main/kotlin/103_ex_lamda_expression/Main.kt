package `103_ex_lamda_expression`

//chap 103. 함수 리터럴과 람다식
// 우리는 지금까지 fun 키워드를 이용항 ㅕ함수를 선언해왔다. 하지만, 코틀리는 함수를 만드는데 간단한 방법을 제공한다.

fun main(args:Array<String>)
{
    val instatFunc:(Int) -> Unit // 변수의 타입이 특이하다. (Int)->Unit은 매개변수가 Int 타입이고 반환타입이 Unit인 함수를 저장할수 있는 타입이다.
    // 이처럼 함수를 저장할수 있는 타입을 함수타입이라고 한다.
    instatFunc = {number:Int -> // // 이부분이 바로 함수 리터럴이다. 함수리터럴이란 말 그대로 함수를 나타내는 리터럴이라는 뜻이다.
        println("Hello$number") }
    // 6번줄의 number:Int 부분은 함수 리터럴의 매개변수를 나타낸다 -> 를 경계로 매개변수와 함수의 내용이 분리된다.
    // 만약 매개변수가 없는 함수 리터럴을 만들고 싶다면, number:Int-> 부분 없이 함수의 내용만 나오면 된다.
    // 함수 리터럴에는 return을 적지 않는다. 함수 리터럴의 반환 값음 함수 내용의 맨 마지막 표현식이 된다.
    // 즉, 다음과 같이 적으면 마지막 표현식이 a+10이므로, 반환값이 a+10이 된다.
    // 6~8번줄의 함수 리터럴은 최종적으로 (Int)->Unit 타입을 갖는다.
    // instantFucn 참조변수에 (Int) -> Unit 타입의 함수가 저장된다.

    instatFunc(33) // instantFunc 참조변수가 가리키는 함수를 호출하고있다. 함수를 담고 있는 변수는 마치 함수인 것처럼 호출할수 있다.
    // Hello33이 출력된다.
    instatFunc.invoke(33) // 함수타입의 변수는 invoke 멤버함수를 통해도 호출할수 있다. 일반적으로 ()는 바로 호출하면 되지만,
    //변수가 Nullable 일 때는 invoke를 통해서 호출하는 편이 instantFunc?.invoke(33)와 같이 쓸 수 있으므로 Null 처리를 하기 편해진다
    // Hello 33이 출력된다.

}
