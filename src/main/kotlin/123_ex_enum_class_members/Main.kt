package `123_ex_enum_class_members`

//chap 122. 열거클래스에 프로퍼티와 멤버함수 선언하기
// 열거 클래스도 클래스의 일종이기 때문에 프로퍼티와 멤버 함수를 가질 수 있다.

enum class Mode(val number:Int) // 일반 클래스처럼 생성자 매개변수에서 프로퍼티를 선언
{
    SELECTION(0),PEN(1),SHAPE(2),ERASER(3) ; // 열거후 ;로 마무리 지어줘야 함.
    // 열거 클래스에 생성자가 있으면 열거 상수에 각각 (인수)를 적어 생성자를 호출해야한다. 열거 상수 가각이 열거 클래스의 인스턴스라고 생각하면 된다.
    // 마지막 열거상수 끝에는 반드시 세미콜론을 붙여야 한다.

    fun printNumber()
    {
        println("모드:$number")
    }
    // 열거 클래스에 멈버함수를 선언하고 있다.
    // 열거 클래스의 프로퍼티나 멤버 함수는 반드시 열거 상수 나열문보다 뒤에 와야 한다.
}

fun main(args:Array<String>){
    //현재 선택된 모드
    val mode:Mode = Mode.ERASER

    println(mode.number)
    mode.printNumber()
    // 열거 클래스의 ERASER 상수의 프로퍼티와 멤버 함수에 접근하고 있다.
}