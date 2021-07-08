package `143_ex_mutable_list_iterator_interface`

// chap 143. MutableListIterator
// MutableListIterator<T> 인터페이스는 ListIterator<T> 와 MutableIterator<T> 인터페이스를 구현한다.
// MutableListIterator<T>에서 추가된 멤버는 다음과 같다.

// abstract fun set(element: T):Unit
// set은 커서가 가리키는 위치의 원소를 element로 교체한다.

// abstract fun add(element: T): Unit
// add는 커서가 가리키는 위치에 element를 추가한다.

fun main(args:Array<String>)
{
    val list = mutableListOf(1, 2, 3)
    val iter: MutableListIterator<Int> = list.listIterator()
    // MutableList<Int> 타입의 list 변수로부터 MutableListIterator<int>를 얻어내고 있다.
    // MutableList의 listIterator 멤버 함수는 ListIterator가 아닌 MutableListIterator를 반환한다.

    println(list) // 초기 list의 상태 [1, 2, 3 ] 출력된다.

    iter.next(); iter.next() // next를 두번 호출하여, iter의 커서가 1번째를 가리키도록 하고 있다.
    iter.add(7) // iter의 커서가 가리키는 위치에 7을 추가하고 있다. [1, 2, 7, 3] 이 출력된다.
    println(list)

    iter.next(); iter.set(10)
    println(list)
    // iter의 커서를 다음 원소로 옮긴 뒤 값을 10으로 수정했다. [1, 2, 7, 10]이 출력된다.

}