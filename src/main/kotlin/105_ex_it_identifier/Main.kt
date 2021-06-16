package `105_ex_it_identifier`

//chap 105. it 식별자
// 람다식의 매개변수가 하나일 때는 매개변수 선언을 생략할 수 있다.

fun main(args:Array<String>)
{
    val instantFunc:(Int) -> Unit = {
        // (int) -> Unit 타입에 맞는 함수 리터럴을 작성하려면 Int 타입의 매개변수를 적어주어야 하지만 생략함.
        println("Hello $it") // 매개변수를 생략하면 it이라는 특별한 식별자가 만들어진다. 여기서 it이 우리가 생략한 Int 타입의 매개변수를 대체한다.
    }

    instantFunc(33) // Hello 33이 출력된다.
}
