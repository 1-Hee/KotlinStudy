package `70_ex_any_class`

fun main(args:Array<String>){

    val building = Building("코틀린",area=100)
    printObject(building)

}

fun printObject(any:Any) {
    println(any.toString())
}

// Building의 인스턴스를 생성하고 있다
// Any 타입의 매개변수로 받는 printObject 함수에 building 객체를 인수로 전달했다.
// 코드상으로는 Any 타입의 tString 멤버함수를 호출하지만, 다형성 덕이 실제론
// Building 객체의 toString() 함수가 호출된다.