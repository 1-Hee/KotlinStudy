package ex_string_plus

fun main(args:Array<String>) {

    // chap 49. 문자열간 + 연산시 주의점
    // Person, Product 타입 처럼 스택이 아닌 힙 영역에서 실제 공간이 할당되는 타입을 참조타입이라고 한다.
    // 코틀린에서 Byte, Short, Int, Long, Float, Double, Char, Boolean 타입을 제외한 타입은
    // 모두 참조 타입이다. 지금까지 String 타입의 변수가 스택 영역에 문자열을 저장하는 것처럼 표현했지만,
    // 사실 실제 문자열은 힙 영역에 생성되며, String 변수는 문자열의 참 조 값을 저장하기 위한 공간만 갖고 있다.

    var first = "Hello"
    var second = " World"
    first += second

    // 위의 코드에서 변수 first에 Hello를 저장한다.
    // 마찬가지로 second 변수에 World를 저장한다
    // 마지막 연산과정은 각각의 변수에 저장된 문자열을 힙 영역에 각각 Hello, World, Hello World로 저장한다.
    // 여기서 문제점은 각각에 연결된 참조 변수가 하나도 없기 때문에 Hello 문자열에 다시 접근할 방법이 없다는 것이다.
    // 따라서, 이런식이라면 메모리의 모든 영역이 위의 문자열로 가득차버리고 말텐데, 이것을 해결할 방법은 다음 장에서 설명한다.

}