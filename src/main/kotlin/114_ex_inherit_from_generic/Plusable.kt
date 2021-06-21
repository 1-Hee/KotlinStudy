package `114_ex_inherit_from_generic`

interface Plusable<T> {
    operator fun plus(other:T):T
}
// T 타입과 덧셈을 가능하게 하는 인터페이스를 선언하고 있다.

