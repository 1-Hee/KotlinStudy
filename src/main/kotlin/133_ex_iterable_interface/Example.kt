package `133_ex_iterable_interface`

// chap 133. Iterable 인터페이스: 클래스가 반족자를 지원하도록 하기
// Iterable 인터페이스는 클래스에 operator fun iterator():Iterator<T>
// 연산자 멤버 함수를 주입하기 위한 인터페이스이다.
// 다음과 같이 선언되어 있다.
// interface Iterable<out T>
// {
//      operator fun iterator():Iterator<T>
// }

// IntRange는 IntProgression과 ClosedRange 인터페이스를, LongRange는 LongProgression과 ClosedRange 인터페이스를,
// CharRange는 CharProgression과 ClosedRange 인터페이스를 구현한다.
// IntProgression, LongProgression, CharProgression는 각각 Iterable<Int>, Iterable<Long>, Iterable<Char>을 상속하며,
// 이 인터페이스 덕에 IntRange, LongRange, CharRange의 인스턴스를 for문의 in 연산자에 쓸 수 있다.
// 각 Progression에는 다음과 같은 프로퍼티가 있다.

// open class IntProgression
// {
//  val first:Int
//  val last:Int
//  val step:Int
// }
// IntProgression을 대표로 예를 들었는데, 다른 Progression도 이와 유사하다.

// first와 last는 Progression(진행)의 시작 값과 끝 값을 가리키는 프로퍼티이다.
// IntRange는 IntProgression과 ClosedRange 인터페이스를 구현하므로 start와 endInclusive외에 fist와 last라는 프로퍼티를 추가적으로 갖는다.

// start와 endInclusive가 있는데 굳이 또 fist와 last를 선언한 이유는 Progression은 큰 수에서 작은 수로 진행할 수도 있기 때문이다.
// 다시 말해, ClosedRange는 1~10처럼 작은수 ~ 큰수 형태로밖에 표현이 안되지만, Progression은 10~1처럼 큰수에서 작은 수로의 이동을 표현할 수 있다.
// ClosedRange는 이름 그대로 범위를 나타내는 클래스이지만, Progression은 수의 진행을 나타내는 클래스라서 그렇다.

// step은 반복자(Iterator<T>)의 next를 호출할 때, 몇 칸씩 건너뛸 것인지를 나타내는 프로퍼티이다.
// 기본 값은 1이라 1, 2, 3, 4, ...의 순서로 nex가 값을 반환하지만, step이 4이면 1,5, 9, 13..의 순서로 값을 반환하게 된다.
// first가 10이고 step이 -2이면 10, 8, 6, 4, ... 의 순서로 값을 반환한다.
