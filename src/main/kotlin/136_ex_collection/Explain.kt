package `136_ex_collection`

// chap 136. Collection 인터페이스 살펴보기

// Collection 인터페이스는 다음과 같이 선언되어 있다.
// Interface Collection<out E>:Iterable<E>
// Iterable<E>는, fun iterator():Iterable<E> 멤버함수를 컬렉션에 주입하기 위한 인터페이스이다.
// Collection 인터페이스는 한 개의 추상 프로퍼티와 , 네 개의 추상 멤버 함수를 갖고 있다.

// abstarct val size:Int
// size는 컬렉션에 포함된 원소의 개수를 갖는 프로퍼티이다.

// abstarct fun isEmpty():Boolean
// isEmpty는 컬렉션이 비어있는지 여부를 반환하는 멤버 함수이다.

// abstract operator fun contains(element:E):Boolean
// contains는 element 원소가 컬렉션에 포함되어 있는지 여부를 반환하는 연산자 멤버 함수이다.
// 컬렉션에 in 연산자를 쓸 수 있도록 하는 역할도 한다.

// abstract fun containsAll(elements:Collection<E>):Boolean
// containsAll은 elements의 원소들이 컬렉션에 모두 포함되어 있는지 여부를 반환하는 연산자 멤버 함수이다.

// abstarct fun iterator():Iterator<E>
// iterator는 컬렉션의 각 원소를 순회하는 Iterator<E> 타입으 ㅣ객체를 반환하는 연산자 멤버 함수이다.
// 컬렉션을 for 문의 in 연산자에 사용할 수 있도록 해준다.