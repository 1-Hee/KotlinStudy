package `122_ex_enum_class`

//chap 122. 열거 클래스(Enum Class)
// 그림판에 프로그램을 만든다고 가정해보자
// 그림판에는 선택모드, 펜모드, 도형모드. 지우개모드 등 여러가지 모드가 있다.
// 현재 선택된 모들르 저장할며ㅕㄴ 어떻게 해야 할까?
// 선택모드 = 0, 펜모드 = 1, 도형모드 = 2, 지우개모드 = 3 이런 식으로 나름의 규칙을 정한 뒤, Int 타입 변수에 저장하는 방법이 있을 것이다.
// 그러나, 이 방법은 각 숫자를 의미를 항상 깅거하고 있어야 하고, 실수나 오타로 지정된 범위 바깥의 값(4, 5 등)을 지정ㅈ하여 버그를 일으킬 수 있다.
// 따라서, Int 타입 변수보다는 이번에 배울 열거 클래스를 사용하는 것이 좋다

enum class Mode // 열거 클래스를 선언하려면 클래스 선언문 앞에 enum 키워드를 붙인다.
{
    SELECTION, PEN, SHAPE,ERASER // 열거클래스에 포함시킬 식별자를 쉼표를 이용해 나열한다. 식별자는 모두 대문자로하는 것이 좋다.
}

fun main(args:Array<String>)
{
    //현재 선택된 모드
    val mode : Mode = Mode.PEN // Mode 타입의 변수는 열거클래스.열거상수 형태로 초기화할수 있다.
    // Mode.PEN 표현식의 타입은 Mode 이다.
    when (mode)
    {
        Mode.SELECTION -> print("선택모드")
        Mode.PEN -> println("펜모드")
        Mode.SHAPE -> println("도형모드")
        Mode.ERASER -> println("지우개모드")
    }
    // mode에 저장된 열거 상수에 따라 분기처리를 하고 있따. mode에는 Mode.PEN이 저장되어 있으므로 펜모드가 출력된다.
}