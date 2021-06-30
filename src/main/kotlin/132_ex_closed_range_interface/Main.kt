package `132_ex_closed_range_interface`

// chap 132. ClosedRange 인터페이스 : 닫힌 구간을 표현하는 인터페이스
// ClosedRange 인터페이스는 다음과 같이 선언되어 있다.
//interface ClosedRange<T:Comparable<T>> {
//    val start:T
//    val endInclusive:T
//    operator fun contains(value:T):Boolean = value >= start && value <= endInclusive
//    fun isEmpty():Boolean = start > endInclusive
//}

// ClosedRange는 타입 매개변수로 Comparable<T>를 구현하는 타입만 받는다.
// 대소 비교가 가능해야 범위를 형성할 수 있기 때문이다.
// start 프로퍼티는 구간의 최소값을, endInclusive 프로퍼티는 구간의 최대값을 나타낸다.
// contains는 in 연산자를 지원하는 역할을 하며, value >= start && value <= endInclusive 라는 기본 구현을 제공한다.
// isEmpty는 구간이 비어 있는지, 즉 구간에 포함되는 객체가 존재하지 않는지 여부를 반환한다.
// start > endInclusive라는 기본 구현을 통해 제공한다.

fun main(args:Array<String>)
{
    val intRange:IntRange = 1..10
    val longRange:LongRange= 1L..100L
    val charRange:CharRange= 'A'..'Z'
    // intRange, LongRange, CharRange는 모두 ClosedRange 인터페이스를 구현하고 있다.

    println(intRange.start) // intRange의 첫번째 값은 1이므로 1이 출력된다.
    println(longRange.endInclusive) // longRange의 마지막 값은 100L 이므로 100이 출력된다.
    println('*'in charRange) // '*'는 'A'..'Z' 구간에 포함되어 있지 않으므로 false가 출력된다.
    println(charRange.isEmpty()) // CharRange 구간은 비어있지 않으므로 false가 출력된다.

}

// Tip. FloatRange, DoubleRange는 어디에?
// 실수 타입에 대한 Range 클래스는 원래 존재하지 않았으나 코틀린 1.1 버전부터 ClosedFloatRange, ClosedDoubleRange라는 클래스를 제공하고 있낀 하다.
// 단 이들을 IntRange, LongRange, CharRange 클래스와 다르게 for 문의 in 연산자에 사용할 수 없는데, iterator 연산자 멤버함수를 갖고 있지 않기 때문이다.
// 상식적으롤 무한대의 소수점을 갖는 실수 타입에 유한개의 원소를 순회하는 반복자를 구현할 수는 없다.
