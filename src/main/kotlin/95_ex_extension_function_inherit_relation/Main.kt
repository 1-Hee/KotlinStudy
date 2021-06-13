package `95_ex_extension_function_inherit_relation`

// chap 95. 확장함수의 리시버 타입이 상속관계에 있을 때

open class AAA; class BBB : AAA()

fun AAA.hello() = println("AAA") // AAA 클래스애 확장 함수 hello를 주입하고 있다.
fun BBB.hello() = println("BBB") // BBB 클래스에 확장 함수 hello를 주입하고 있다.

fun main(args:Array<String>){
    val test:AAA = BBB() // 타입은 AAA이나, 실제로는 BBB 객체를 가리키는 test 참조변수를 선언하고 있다.
    test.hello() // 여기서 AAA.hello()가 호출될까? BBB.hello()가 호출될까? 정답은 AAA.hello()이다.
    // 확장 함수는 멤버 함수와는 다르게 참조 변수가 실제로 가리키는 객체의 타입을 따르지 않고, 참조 변수의 타입을 그대로 따른다.
    // 멤버함수와 확장 함수의 동작이 같을 것이고 생각하지 말자
}