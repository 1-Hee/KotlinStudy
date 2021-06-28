package `124_ex_enum_class_practice`

// chap 124. 열거 클래스 활용하기
// 모든 열거 클래스는 자동으로
enum class Mode
{
    SELECTION, PEN, SHAPE, ERASER
}
// '열거 클래스' 예제의 코드를 그대로 가져왔다.


fun main(arg:Array<String>)
{
    val shapeMode:Mode = Mode.SHAPE // Mode.SHAPE 열거 상수를 shapeMode 변수에 대입하고 있다.
    println(shapeMode.name)
    println(shapeMode.ordinal) // 각 열거 상수에 존재하는 name 프로퍼티는 열거 상수의 이름을 의미하고, ordinal은 열거 상 수의 순서를 의미한다.
    // 열거 상수의 순서는 0부터 시작하기 때문에 세 번째에 있지만 2가 출력되었다.

    val modes:Array<Mode> = Mode.values() // 열거 클래스의 values 멤버 함수는 열거 클래스에 들어있는 모든 열거 상수들을 배열로 반환한다.
    for(mode:Mode in modes) //for 문을 이용하여 모든 열거 상수의 값을 출력하고 있다.
        println(mode)

    println(Mode.valueOf("PEN").ordinal)
    // 열거 클래스의 valueOf 멤버 함수는 String 타입의 열거 상수의 이름으로부터 열거 상수를 찾아 반환한다.
    // "PEN"에 해당하는 열거 상수의 순서를 출력하고 있다. 1이 출력된다.
}