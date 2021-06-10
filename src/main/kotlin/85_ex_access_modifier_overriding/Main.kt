package `85_ex_access_modifier_overriding`

//chap 85. 접근 지정자 오버라이딩
// 오버라이딩을 통해 protected인 프로퍼티나 멤버 함수의 접근 지정자를 public으로 변경 가능하다.

open class AAA(protected open val number:Int) // protected 프로퍼티 number를 갖는 AAA 클래스 선언, 오버라이딩이 가능하게 "open" 붙임.
{
    protected open fun hello() // 멤버함수 hello 선언, 오버라이딩이 가능하도록 open 붙임.
    {
        println("hello")
    }
}

class BBB(number:Int):AAA(number)
{
    public override val number:Int // number 프로퍼티를 오버라이딩 하면서, 접근 지정자를 public으로 바꿈.
    get() = super.number

    public override fun hello() = super.hello()
}

fun main(args:Array<String>)
{
    val b = BBB(26)
    val a : AAA =b          // 동일한 인스턴스 BBB를 AAA 타입과 BBB 타입으로 가리키고 있음.

    // println(a.number) //에러 ;  a는 AAA 타입이므로 protected인 number 프로퍼티에 접근하면 오류 발생.
    // a.hello() // 에러 ; a는 AAA 타입이므로 protected 인 멤버함수 hello 프로퍼티에 접근하면 오류를 발생
    println(b.number) // b는 BBB 타입이므로 오버라이딩된 number 프로퍼티에 접근 가능
    b.hello() // b는 BBB 타입이므로 pulbic으로 오버라이딩된 hello 멤버함수 접근 가능.
}