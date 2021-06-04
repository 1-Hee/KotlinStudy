package `75_ex_null`

import ex_constructor.Person

// chap 75. Nullable 타입과 null

fun main(args:Array<String>){
    var person : Person? = Person("K",30)
    person = null

    var num :Int? = null
    num = 0
}

// 타입이름 뒤에 ?를 붙이면 변수를 Nullable 하게 만들 수 있다.
// Nullable 이란 null 값을 지정할 수 있는 변수를 뜻한다. null은 찿ㅁ조변수가 어떠한 객체라도 가리키지 않고 있ㅇ므을 나타내는 키워드이다.
// person 참조변수에 null을 지정하고 있다. null은 Noting 타입의 표현식이며, Nothing은 어떠한 타입과도 호환되므로 null을 Person? 타입에 대입할수 있다.

// 기본적으로 null을 지정할 수 없는 코틀린
// 자바는 모든 참조 타입에 기본적으로 null을 지정할 수 있다.
// 하지만 코틀린에서는 Nullable 타입이 아니면 null을 지정하지 못한다.

// if-else 표현식의 한쪽 블록에서 null을 지정하면?
// if (true) "Test" else null
// "test"는 String, null은 Nothing? 타입이다. if-else 표현식의 타입은 이 둘이 합쳐진 String?이 된다.