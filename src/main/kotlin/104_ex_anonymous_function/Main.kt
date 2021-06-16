package `104_ex_anonymous_function`
//chap 104. 익명함수
// 함수리터럴을 작성하는 또 다른 방법인 익명함수에 대해서 알아보자.

fun main(arg:Array<String>){
    val instantFunc:(Int) -> Unit = fun(number:Int):Unit
    {
        println("Hello$number")
    }
    instantFunc(33)
    instantFunc.invoke(33)

}

// 이전예제의 람다식으로 된 함수 리터럴을 익명함수의 형태로 바꾸어 보었다.
// 익명함수는 함수의 이름이 없다는 점만 빼면 일반 함수와 형태가 거의 동일하다.
// 익명함수는 람다식보다 복잡하지만, return으로 반환값을 직접 지정해줄 수 있기 때문에 마지막 표현식이 자동으로 반환되어 버리는 람다식보다 버그를 일으킬 확률이 적다.
// 4~7번 줄의 익명 함수의 타입은 (Int)->Unit으로, 이전 예제와 동일하다.