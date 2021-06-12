package `92_ex_lateinit`

// 클래스의 프로퍼티는 선언과 동시에 초기화하거나 init 블록 안에서 반드시 초기화해주어야 한다.
// 그러나 이런 강제성은 너무 불편하다. 프로퍼티 타입이 String 이나 Int라면 ""이나 0 등으로 초기화하면 되지만,
// 만약 사용자정의 클래스라면 어떻게 초기화할 것인가?

//점을 표현하는 클래스
class Point(val x:Int, val y:Int)

//사각형을 표현하는 클래스
class Rect
{
    lateinit var pt:Point // pt와 pt2 앞에 lateinit 키워드를 붙였다.
    // lateinit 키워드가 붙은 프로퍼티는 클래스 안에서 바로 초기화하지 않아도 된다. lateinit은 var 프로퍼티에만 붙일 수 있다.
    lateinit var pt2:Point

    val width:Int get() = pt2.x-pt.x // 사각형의 너비, 높이, 넓이를 갖고 있는 프로퍼티를 선언하고 있다.
    val height:Int get() = pt2.y - pt.y // 실시간으로 너비, 높이, 넓이 값을 계산하기 위해 Getter를 커스터마이징했다.
    val area get() = width*height
}

fun main(args:Array<String>)
{
    val rect = Rect()
    rect.pt = Point(3,3) // rect 객체의 pt, pt2 프로퍼티에 Point 객체를 지정하고 있다.
    rect.pt2 = Point(6, 5)

    println("너비:${rect.width}") // rect 객체의 너비, 높이, 넓이를 출력하고 있다.
    println("높이:${rect.height}") // 만약 pt와 pt2 프로퍼티에 값을 지정하지 않은 채 프로퍼티에 값을 지정하지 않은 채 프로퍼티에 접근하면,
    println("넓이:${rect.area}") // UninitializedPropertyAccessException 예외가 발생한다.
}