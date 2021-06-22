package `115_ex_generic_specific_type`

//chap 115. 특정타입을 상속-구현하는 타입만 인수로 받기
// 제네릭을 사용하다보면 특정 타입에만 선언되어 있는 프로퍼티나 멤버 함수에 접근하기 위해 특정 타입만 인수로 받아야 할 때가 있다.
// 타입 인수를 특정 타입으로 제한하는 방법을 알아보자.

fun <T:ValueContainer> T.printValue()
// 특정 타입을 구현하는 타입만 인수로 받으려면, 상속을 할 때처럼 타입 매개변수 뒤에 [:타입이름]을 적어준다. :타입 1, 타입2, .. 와 같이 적으면 여러 개를 지정할 수도 있다.
{
    println(this.getValue())
    // T 타입은 ValueContainer 인터페이스를 구현하므로 getValue 멤버 함수를 호출할 수 있다.
}

fun main(args:Array<String>)
{
    AAA().printValue()
    BBB().printValue()
}

