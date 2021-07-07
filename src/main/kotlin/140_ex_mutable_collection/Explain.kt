package `140_ex_mutable_collection`

// chap 140. 변경할 수 있는(Mutable) 컬렉션
// 지금까지 살펴본 collection, List, Map 인터페이스에는 컬렉션에 원소를 추가하거나 삭제하는 멤버함수가 없었다.
// collection 인터페이스는 컬렉션의 원소를 수정할 수 있는 방법을 제공하지 않는다.
// 컬렉션의 원소를 수정하려면 MutableCollection 인터페이스를 구현하는 컬렉션을 이용해야 한다.

// MutableCollection은 다음과 같이 선언되어 있다.
// interface MutableCollection<E> : Collection<E>, MutableIterable<E>
// MutableCollection 인터페이스는 Collection과 MutableIterable 인터페이스를 상속한다.
// MutableIterable 인터페이스는 다음과 같이 선언되어 있다.

// interface MutableIterable<out T> : Iterable<T>
// {
//      override fun iterator():MutableIterator<T>
// }

// MutableIterable<T> 인터페이스는 Iterable 인터페이스에 선언된 iterator 멤버 함수를 오버라이딩하여 반환 타입을 MutableIterator<T>로 바꿔준다.
// MutableIterator<T>는 Iterator<T>를 상속하므로 문제 없다.
// MutableIterable<E> 인터페이스는 다음과 같은 멤버를 갖고 있다.

// abstract fun add(element:E):Boolean
// add 멤버 함수는 컬렉션에 element 원소를 추가한다.
// 원소가 성공적으로 추가되었으면 true를 반환한다.
// 만약, 컬렉션이 원소의 중복을 허용하지 않는다는 등의 이유로 원소를 추가하지 못하면 false를 반환한다.

// abstract fun addAll(elements:Collection<E>):Boolean
// addAll 멤버 함수는 elements 컬렉션의 모든 원소를 컬렉션에 추가한다.
// 원소가 하나라도 추가되었으면 true를, 단 한개도 추가되지 않았으면 false를 반환한다.

// abstract fun removeAll(elements:Collection<E>):Boolean
// removeAll 멤버 함수는 elements 컬렉션의 원소들과 일치하는 '모든' 원소를 컬렉션에서 제거한다.
// 원소가 하나라도 제거되면 true를, 삭제된 원소가 없으면 false를 반환한다.

// abstract fun clear()
// clear는 컬렉션의 모든 원소를 삭제하는 멤버 함수이다.

