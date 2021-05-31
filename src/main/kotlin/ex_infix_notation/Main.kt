package ex_infix_notation

// chap 63. 멤버함수의 중위 표기법 (infix Notation)

class Point(var x:Int = 0, var y:Int = 0){
    //base를 원점으로 생각했을 때의 좌표를 반환한다
    infix fun from(base: Point):Point
    {
        return Point(x-base.x, y-base.y)
    }
}

fun main(args:Array<String>)
{
    val pt = Point(3,6) from Point(1,1)
    println(pt.x)
    println(pt.y)

    // 중위표기법이란, 피연산자-연산자-피연산자의 순서로 표현식을 구성하는 방식이다.
    // 멤버 함수의 매개변수가 하나뿐이면 함수 호출을 중위 표기법으로 할 수 있다.
    // 중위표기법을 지원하려면  멤버함수 선언문 앞에 infix를 붙여야 한다.
    // from 멤버 함수를 중위표기법으로 호출하고 있다.
    // Point(3,6) from Point(1,1)은 문법적 설탕으로, 소괄호 하나가 더 줄어 읽기 편하다.

}