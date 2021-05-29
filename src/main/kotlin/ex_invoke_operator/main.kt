package ex_invoke_operator

//chap 61. 호출연산자(invoke operator)

fun main(args:Array<String>)
{
    val product = Product(762443, "코틀린 200제")
    product(108)

    // 연산자를 오버로딩하는 멤버함수 invoke를 선언하고 있다.
    // product(108)은 컴ㅁ파일시 product.invoke(108)로 번역된다. 만약 product(108, "Hi")와 같이 적었다면
    // product.invoke(108, "Hi")로 번역된다.

}