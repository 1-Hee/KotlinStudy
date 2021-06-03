package `70_ex_any_class`

import javax.print.attribute.standard.MediaSize

// chap 70. Any 클래스
// 어떤 클래스가 아무 클래스도 상속하지 않으면 자동으로 Any라는 클래스를 상속한다.
// 다른 클래스를 상속한다 해도 그 클래스 또한 Any 클래스를 자동으로 상속하는 것이므로, 간접적으로 Any를 상속하게 된다.
// Any 클래스에는 세가지 멤버함수가 있다
// = equals, hashCode, toString
// 세 함수의 용례는 다음과 같다.

// open class Any
// {
//    open operator fun equals(other:Any?):Boolean // 연산자를 오버로딩하는 멤버함수
//    open fun hashCode():Int // 객체 고유의 해시코드를 반환하는 멤버함수
//    open fun toString():String // 객체의 내용을 String 타입으로 변환하는 멤버함수
// }

// 멤버 함수 예제에서 사용했던 Building 클래스를 수정하여 Any 클래스의 toString 멤버함수를 오버라이딩하도록 하자.

class Building( val name: String = "",  // 건물명
                val date: String = "", // 건축일자
                val area:Int=0) //면적(m2)
{
    override fun toString() =
        "이름:${this.name}\n" +
        "건축일자:${this.date}\n" +
        "면적:${this.area} m2"
}

// 생성자와 프로퍼티를 한번에 쓰도록 수정했다.
// 기존 print 멤버함수를 toString 멤버함수로 수정했다
// override 키워드를 붙여 Any 클래스의 toString을 오버라이딩하도록 했다.

