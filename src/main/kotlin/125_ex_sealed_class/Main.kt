package `125_ex_sealed_class`

fun main(args:Array<String>)
{
    val instance : Outer = Outer.Three()

    val text:String = when (instance)
    // instance 변수의 실제 타입을 판별하여 대응되는 String 리터럴로 반환하는 when 표현식이다.
    // sealed 클래스는 서브클래스가 sealed 클래스 안에 모두 존재하므로, 모든 서브 타입을 체크했다면 when의 else 블록을 생략해도 표현식을 구성할 수 있다.
    {
        is Outer.One -> "첫번째"
        is Outer.Two -> "두번째"
        is Outer.Three -> "세번째"
    }

    println(text) // 세번째가 출력된다.
}