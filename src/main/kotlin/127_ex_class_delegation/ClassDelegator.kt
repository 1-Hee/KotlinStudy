package `127_ex_class_delegation`

class ClassDelegator:Plusable
{
    override fun plus(other:Int):Int
    {
        println("기본 구현")
        return other
    }
}
// chap 127. 클래스 위임
// 코틀린에서는 인터페이스의 구현을 다른 클래스에 맡길 수 있는 문법도 제공한다.
// Plusable 인터페이슬르 구현하는 클래스를 선언하고 있다.
