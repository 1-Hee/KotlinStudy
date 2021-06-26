package `118_ex_iterator`

//chap 118. 반복자
// 반복자(Iterator)란, 특정 구간 속에 있는 원소를 하나씩 반복적으로 꺼내기 위한 인터페이스를 뜻한다.
// 코틀린에서는 Iterator라는 인터페이스가 기본적으로 선언되어 있으며, 다음과 같이 생겼다.

// interface Iterator<out T>
//{
//    operator fun next():T
//    operator fun hasNext():Boolean
//}
// 예저를 통해 next와 hasNext 멤버 함수를 언제 사용하는지 알아보자

fun main(args:Array<String>){
    val range:IntRange = 1..3
    val iter:Iterator<Int> = range.iterator()
    // IntRange 클래스에는 operator fun iterator():IntIterator 연산자 멤버 함수가 선언되어 있다.
    // IntIterator는 Iterator<Int>를 구현하는 클래스이기 때문에 Iterator<Int> 타입으로 받을 수 있다.

    println(iter.hasNext())
    println(iter.next())
    // iter는 1..3 구간 중 첫 원소인 1의 바로 이전을 가리키고 있다.
    // 여기서, 특정원소를 가리키는 Iterator 내부의 변수를 커서(cursor)라고 부른다. iter.hasNext()는 다음 원소가 있으면 true, 없으면 false를 반환한다.
    // iter는 다음 원소로 1을 가리킬 예정이므로 true가 출력된다.

    println(iter.hasNext())
    println(iter.next())

    println(iter.hasNext())
    println(iter.next())

    println(iter.hasNext())
    // 참고로 hasNext가 false 를 반환했는데도 next를 호출하면 NoSuchElementException 예외가 발생한다.
}