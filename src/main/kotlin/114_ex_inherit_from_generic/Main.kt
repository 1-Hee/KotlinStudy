package `114_ex_inherit_from_generic`

//chap 114. 제네릭이 적용된 클래스/ 인터페이스 상속, 구현하기
// 제네릭이 적용된 클래스나 인터페이스는 상속할 때 타입 인수를 전달해주어야 한다.

fun main(args:Array<String>)
{
    val rect = Rectangle(10, 5)
    val rect2 = Rectangle(3, 8)
    // Rectangle의 인스턴스를 두 개 생성하고 있다.

    println(rect + rect2)
    //width:13, height:13이 출력된다.
}