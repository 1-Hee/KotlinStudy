package `111_ex_generic_several_types`

// chap 11. 여러 타입을 인수로 받기
// 타입인수를 여러개 받으려면 fun 키워드와 함수 이름 사이를 <타입1, 타입2, ...> 형식으로 적는다.

fun <T, R> T.map(mapper:(T)->R):R
// 타입 매개변수 T와 R을 선언하여, 두 개의 타입 인수를 받을 수 있게 했다.
// mapper 매개변수에는 T 타입을 R 타입으로 변환하는 함수를 받도록 했다.
// T.map 에서 볼 수 있듯이, 확장 함수의 리시버에도 타입 매개변수를 적용할 수 있다.
// 사실상 타입이 쓰일 수 있는 대부분의 자리에 타입 매개변수를 슬 수 있다고 보면 된다.

{
    return mapper(this)
    // 매개변수로 받은 mapper 함수에 리시버(this)를 넣어 호출한 뒤, 반환 값을 그대로 반환하고 있다.
}

fun main(args:Array<String>)
{
    val square : Int =
        11.map {
            it * it
        }
    // 11에 map 확장 함수를 호출한 뒤, 제곱을 반환하는 함수를 mapper 매개변수로 전달했다.
    // 원래는 11.map<Int, Int>{...}로 써주어야 하지만, 함수 리터럴로부터 타입 추론이 간으하기 때문에 타입 인수를 생략했다.
    // 함수 리터럴의 매개변수 11과 반환 값 it * it이 Int 타입이므로, T와 R에 각각 Int 타입이 들어간다.
    // map 확장 함수의 반환 값을 square 변수에 저장했다.
    println(square)
    // 121이 출력된다.
}