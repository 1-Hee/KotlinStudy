package `131_ex_comparable`

// chap 131. Comparable 인터페이스 : 클래스를 비교 가능하게 만들기
// 인터페이스 예제에서 언급했었던 comparable 인터페이스를 제대로 살펴보게 되었다.
// Comparable 인터페이스는 다음과 같이 선언되어 있다.
// interface Comparable<in T>
// {
//   operator fun compareTo(other:T):Int
// }
// 타입 매개변수 T를 받으며, 연산자 멤버 함수로 compareTo를 가지고 있다.
// 즉, Comparable 인터페이스를 구현하는 클래스는 비교 연산자(>, <, >=, <=)를 지원하게 된다.

class Rectangle(val width:Int, val height:Int):Comparable<Rectangle>
{
    val area = width * height

    override fun compareTo(other:Rectangle):Int =
        when
        {
            this.area > other.area -> 1
            this.area < other.area -> -1
            else -> 0
        }
    // 사각형의 넓이로 인스턴스의 대소를 비교하도록 compareTo를 오버라이딩 함.
}

fun main(args:Array<String>)
{
    val rect = Rectangle(3,5)
    val rect2 = Rectangle(7,3)
    val rect3 = Rectangle(2, 9)

    println(rect >= rect3)
    println(rect < rect2)
    println(rect2 > rect3)
// Rectangle의 인스턴스들끼리 대소를 비교.
}