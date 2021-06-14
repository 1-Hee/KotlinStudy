package `97_ex_interface`

//chap 97. 인터페이스
// 인터페이스는 클래스에 어떤 멤버 함수와 프로퍼티가 반드시 존재한다는 것을 보장하기 위한 장치이다.

interface Printable // 인터페이스를 선언하고 있다. class 키워드 대신 interface 키워드를 사용하면 인터페이스를 선언할 수 있다.
// 인터페이스는 멤버 함수, 추상 멤버 함수, 추상 프로퍼티를 가질 수 있다.
// 일반 프로퍼티와 생성자는 가질 수 없다.
{
    fun print():Unit // printable 인터페이스 안에 print 멤버함수가 들어 있다. 인터페이스의 멤버함수는 내용이 비어있으면 자동으로 abstract가 붙는다.
}

class AAA : Printable // AAA 클래스가 printable 인터페이스를 구현하고 있다. 인터페이스에는 생성자가 존재하지 않기 대문에 상속할 때 이름 옆에 ()를 쓰지 않는다.
//또한 인터페이스는, 한번에 하나씩만 상속할수 있는 클래스와 다르게 여러 개를 구현할 수 있다.
{
    override fun print() // printable 인터페이스 안에는 추상 멤버함수가 들어 있으므로,
    // 이들을 반드시 모두 오버라이딩 해야한다. Pirntable 인터페이스의 추상 멤버함수 print를 오버라이딩 하고 있다.
    {
        println("Hello")
    }
}

fun print(anything:Printable) // printable 타입의 인수를 받는 함수 print를 선언
{
    anything.print() // 매개변수 타입이 Printable 이므로 그 매개변수가 가리키는 객체에 print 함수가 들어있다는 것을 항상 보장할수 있다.
}

fun main(args:Array<String>)
{
    print(AAA()) // print 함수에 AAA 객체를 전달학호 있다. AAA 클래스는 Printable 인터페이스를 구현하므로 AAa 객체를 Printable 타입으로 가리킬 수 있다.
}

// 인터페이스는 어디에 쓰는 것이 좋을까?
// 일단 인터페이스는 기존의 클래스를 확장한다기보다 어떤 클래스에 플러그인을 추가한다는 개념에 가깝다.
// 예컨데, AAA 클래스가 printable 인터페이스를 구현한다는 것은 AAA에 출력기능을 갖는 Printable 플로그인을 탑재시키는 것이라고 보면 된다.

