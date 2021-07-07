package `141_ex_mutable_iterator_interface`

// MutableIterator 인터페이스는 다음과 같이 선언되어 있다.
// public interface MutableIterator<out T> : Iterator<T>
// {
//      public fun remove():Unit
// }
// 보다시피, 커서가 가리키고 있는 원소를 삭제할 수 있는 멤버 함수 remove가 추가되었다.

fun main(args:Array<String>)
{
    val list = mutableListOf(1, 2, 3)
    val iter:MutableIterator<Int> = list.iterator()
    // MutableList<Int> 타입의 list 변수로부터 MutableIterator<Int>를 얻어내고 있다.

    println(list) // 초기 list의 상태 [1,2,3]이 출력된다.

    iter.next(); iter.remove() // 반복자의 커서를 첫 번째 원소로 옮기기 위해 next를 호출한 뒤, remove를 호출하여 첫 원소를 삭제했다.
    println(list) // 1, 2,3 이 출력된다.

    iter.next(); iter.remove() // 반복자의 커서를 다음 원소로 옮기고 remove를 호출하여 삭제했다. [3]이 출력된다.
    println(list)


}
