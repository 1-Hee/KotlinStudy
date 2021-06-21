package `113_ex_generic_to_class_and_interface`

class Pair<A, B>(val first:A, val second:B)
// 클래스나 인터페이스에서 타입을 인수로 받으려면, 선언시 이름 옆에 <식별자>를 붙인다.
// Pair 클래스에 타입 매개변수 A와 B를 선언했다.
// 이제 Pair 클래스에 두 개의 타입을 지정할 수 있다.
// A와 B 타입의 프로퍼티를 선언하고 있다.
// 이처럼 클래스 타입 매개변수는 클래스 내부 전체에서 사용이 가능하다.


{
    override fun toString() = "$first\n$second"
    // 모든 타입은 Any 클래스를 상속하므로, 어떤 타입이 오더라도 toString 멤버함수를 가지고 있다는 것이 보장된다.
    // 그래서 "$first\n$second"와 같은 표현식이 가능하다.
}