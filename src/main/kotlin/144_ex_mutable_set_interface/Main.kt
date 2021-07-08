package `144_ex_mutable_set_interface`

// chap 144. MutableSet 인터페이스를 살펴보기
// mutableSetOf 함수를 호출하면 MutableSet<E> 타입의 객체가 반환된다.
// MutableSet<E> 인터페이스는 MutableCollection<E>를 상속한다.
// MutableSet<E>에서 따로 추가된 멤버는 없으므로 멤버 설명은 생략하겠다.

fun main(args:Array<String>)
{
    val set:MutableSet<Int> = mutableSetOf(1, 5, 7)
    println(set) // 초기 set의 값 [1, 5, 7] 이 출력된다.

    println(set.add(5)) // 5는 이미 set에 존재하므로 추가되지 않는다. false가 출력된다.
    println(set) // [1, 5, 7]가 출력된다.

    println(set.addAll(listOf(3, 7))) // 8은 이미 set에 존재하므로 추가되지 않고, 3만 set에 추가된다. 추가된 원소가 존재하므로 true가 출력된다.
    println(set) // [1, 5, 7, 3]가 출력된다. 여기서 출력되는 순서는 추가된 순서와는 무관하다. set은 원소가 순서를 가지지 않기 때문이다.


}