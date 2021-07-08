package `142_ex_mutable_list_interface`

//chap 142. MutableList 인터페이스 살펴보기

// mutableListOf 함수를 호출하면 mutableList<E> 타입의 객체가 반환된다.
// MutableList<E> 인터페이스는 MutableCollection<E>를 상속한다.
// 다음은 MutableList<E>에서 추가된 멤버들이다.

// abstract fun add(index:Int, element:E):Unit
// abstract fun addAll(index:Int, elements:Collection<E>):Boolean
// absract operator fun set(index:Int, element: E): E
// abstract fun removeAt(index:Int): E

// List는 각 원소에 순서가 있으므로, 이를 지원하는 멤버 함수가 추가되었다.
// add는 index 위치에 elemnet를 추가하는 멤버 함수이다.
// addAll은 index 위치에 elements 컬렉션에 있는 모든 원소를 추가하는 멤버함수이다.
// List에 변경에 일어났으면 true를 반환한다.
// set은 [] 연산자를 오버로딩하는 멤버 함수이다. index번째 위치의 원소를 element로 교체한다.
// 반환값은 이전에 index 위치에 있던 원소이다.
// 단, list[2] = 5 형태로 set을 호추할 때는 반환값을 얻을 수 없다.
// removeAt은 index번째 원소를 삭제하는 멤버 함수이다. 반환값은 삭제된 원소이다.

