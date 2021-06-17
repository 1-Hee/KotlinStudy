package `106_ex_function_reference`

//chap 106. 함수 참조
// 함수타입의 변수는 이미 선언되어 있는 함수나 객체의 멤버함수를 가리킬 수도 있다.

fun plus(a:Int, b:Int) = println("plus 호출됨${a+b}") // 매개변수 타입이 (Int, Int)이고 반환 타입이 Unit인 함수를 선언

object Object
{
    fun minus(a:Int, b:Int) = println("Object의 minus 호출툄 ${a-b}") // 매개변수 타입이 (Int, Int)이고 반환타입이 Unit인 객체의 멤버함수 선언
}

class Class // 매개변수 타입이 (Int, Int)이고, 반환타입이 Unit인 Class의 멤버함수 선언
{
    fun average(a:Int, b:Int) = println("Class average 호출됨 ${(a+b)/2}")
}

fun main(args:Array<String>){
    var instantFunc:(Int, Int) -> Unit // (Int, Int) -> Unit 함수 타입의 참조변수 instantFunc를 선언하고 있다.
    instantFunc = ::plus // 함수 plus의 참조값을 instatntFunc 참조변수에 저장하고 있다. 함수 이름 앞에 ::를 붙이면, 표현식의 값은 그 함수의 참조값이 되며, 타입은 그 함수의 시그니처에 맞는 함수타입이 된다.
    instantFunc(60, 27)

    instantFunc = Object::minus // 객체의 멤버함수를 instantFuc 참조 변수에 대입하고 있다. 객체의 ㅁ메버 함수를 함수 타입의 표현식으로 바꾸려면 참조변수::멤버함수의 꼴로 적는다.
    instantFunc(36,12)

    instantFunc = Class()::average // 클래스의 인스턴스의 멤버함수를 instantFunc 참조 변수에 대입하고 있음.
    instantFunc(25, 15)
}