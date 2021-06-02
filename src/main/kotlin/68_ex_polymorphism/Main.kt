package `68_ex_polymorphism`

// chap 68. 다형성의 활용
// 오버라이딩을 통해 다형성을 활용하는 방법을 알아보자.

open class AAA
{
    open fun hello() = println("AAA입니다")
}
class BBB : AAA()
{
    override fun hello() = println("BBB 입니다.")
}

fun main(args:Array<String>)
{
    val one = AAA()
    val two = BBB()
    val three : AAA = two

    one.hello()
    two.hello()
    three.hello()
}

// one, two 참조변수에 각각 AAA 인스턴스와 BBB 인스턴스를 저장하고 있따.
// three 참조 변수에는 two에 저장된 BBB 인스턴스를 저장하고 있다.
// one은 AAA 인스턴스, two는 BBB 인스턴스
// 23번줄의 Three는 BBB 클래스의 hello 멤버함수가 호출됨
// 여기서 볼수 있듯이 오버라이딩 된 멤버함수를 호출하면 참조변수가 실제로 가리키고 있는 객체의 멤버 함수가 호출됨.
// 이처럼 멤버함수를 호출하는 형태는 한 가지이지만, 문맥에 따라 실제로 호출되는 함수가 다르다.
