package `67_ex_overriding_property`

// chap 67. 프로퍼티를 오버라이딩하기
// 프로퍼티에도 함수의 일종인 Getter/Setter가 존재하므로 오버라이딩이 가능하다.

open class AAA
{
    open var number = 10
    get()
    {
        println("AAA number Getter 호출됨")
        return field
    }
    set(value)
    {
        println("AAA number Setter 호출됨")
        field = value
    }

}

class BBB : AAA()
{
    override var number:Int
        get()
        {
            println("BBB number Getter 호출됨")
            return super.number
        }
        set(value)
        {
            println("BBB number Setter 호출됨")
            super.number = value
        }

}
fun main(args:Array<String>)
{
    val test = BBB()
    test.number = 5
    test.number
}

// 프로퍼티를 오버라이딩 하기 위해 AAA 클래스의 number 프로퍼티에 open 키워드를 붙였다.
// number 프로퍼티의 Getter 동작을 커스터마이징하고 있다.
// number 프로퍼티의 Setter 동작을 커스터마이징하고 있다.
// AAA 클래스의 number 프로퍼티를 오버라이딩 하고 있다. 프로퍼티를 오버라이딩할 때도 override 키워드를 붙ㅇ려야 한다.
// super.number와 같이 하면 슈퍼클래스인 AAA 클래스의 number 프로퍼티의 Setter가 호출된다.
// BBB의 인스턴스를 생성하고 있다.
// BBB 클래스에서 오버라이딩한 number 프로퍼티의 Setter가 호출된다.
