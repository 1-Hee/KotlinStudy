package `100_ex_inner_class`

// chap 100. 내부클래스
// 중첩 클래스가 단순히 식별자만 바깥 클래스에 속해있는 것이었다면, 내부클래스는 인스턴스 바깥 클래스의 인스턴스에 완전히 소속된다.
// 글로만 이해하려면 어려운 개념이니, 예제와 그림을 통해 좀 더 자세히 알아보자.

class Outer(private val value:Int) // value 프로퍼티와 print 멤버함수를 갖는 Outer 클래스를 선언
{
    fun print()
    {
        println(this.value)
    }

    inner class Inner(private val InnerValue:Int) // innerValue 프로퍼티와 print 멤버 함수를 갖는 Inner 내부클래스를 선언하고 있다. 내부 클래스를 선언할 때는 선언문 앞에 inner 키워드를 붙인다.
    {
        fun print()
        {
            this@Outer.print()
            println(this.InnerValue + this@Outer.value)
        }
    }
}

fun main(args:Array<String>)
{
    val instance:Outer = Outer(610) // Outer의 인스턴스 생성
    val innerInstance : Outer.Inner = instance.Inner(40) // Outer.Inner 의 인스턴스를 생성
    // 특이하게도 내부 클래스의 인스턴스를 생성하려면 "인스턴스이름.생성자()"가 아니라 "참조변수.생성자()"를 해야한다. 내부 클래스는 바깥 클래스의 인스턴스로부터만 생성할 수 있기 때문이다.
    innerInstance.print()
}

// 내부 클래스의 인스턴스는 자신이 속해 있는 바깥 클래스의 인스턴스를 가리키는 참조변수를 내부적으로 가지고 있다.
// 그림에 보이는 this@Outer의 정체가 바로 그것이다.
// 내부 클래스는 this@Outer 키워드를 이용하여 자신이 속한 바깥 클래스의 인스턴스에 접근할 수 있다.
// 이런 특성 때문에 내부 클래스의 인스턴스는 반드시 "바깥 클래스의 인스턴스.생성자()"꼴로 생성해야 한다.