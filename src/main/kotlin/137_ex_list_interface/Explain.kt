package `137_ex_list_interface`

// chap 137. List 인터페이스 살펴보기

// List 인터페이스는 다음과 같이 선언되어 있다.
// interface List<out E> : Collection<E>

// List 인터페이스는 다음과 같은 추상 멤버 함수를 갖고 있다.
// abstract operator fun get(index:Int):E
// get은 List 의 index번째 우너소를 반환하는 멤버 함수이다.
// List에 [] 연산자를 쓸 수 있도록 하는 역할도 한다.

// abstract fun indexOf(element:E):Int
// indexOf은 element 원소가 List의 몇 번째 인덱스에 위치해있는지를 반환하는 멤버 함수이다.
// 만약, element에 해당하는 원소가 없으면 -1을 반환한다.
// element와 동일한 원소가 여러 개 있으면, 첫 번째로 일치하는 원소의 인덱스를 반환한다.

// abstarct fun lastIndexOf(element:E):Int
//lastINdexOf 멤버 함수는 마지막으로 일치하는 원소의 인덱스를 반환한다는 점만 빼면 indexOf과 같다.

// abstract fun listIterator():ListIterator<E>
// abstract fun listIterator(index:Int):ListIterator<E>

// listIterator는 List에 특화된 Iteartor를 반환하는 멤버 함수이다.
// index 매개변수에 값을 지정하면, 그 인덱스부터 시작하는 ListIterator를 반환한다.

// abstract fun subList(fromIndex:Int, toIndex:Int):List<E>
// subList는 [fromIndex, toIndex] 구간의 원소를 뽑아 새로운 List를 만들어 반한하는 멤버 함수이다.

