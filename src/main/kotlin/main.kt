// Kotlin에서 fun=함수 를 의미함, java와 달리 class가 필요가 없어서 Hello world를 출력할때도 훨씬 깔끔한 것이 특징임.
fun main(args: Array<String>):Unit { // 왼쪽의 형식이 가장 기본적인 코틀린의 구조(함수)이다.
    println("Hello World!") // Kotlin에서는 ;이 필수가 아니다, 붙여도 출력되고 없어도 출력된다. 세미콜론(;)은 주로 한문장에 두개 이상 쓸대 사용.

    53+62-126 // Kotlin에서는 단순히 숫자만 이용해 연산을 해도 연산은 가능함.

    println(53+62-126)


    var total:Int // Kotlin의 변수선언형식, [ 변수(var) 변수이름 : 변수타입(Int 등) ] 으로 함
    total = 0 // 변수에 값을 넣을 때에는 [ 변수 = 0 ]의 형식으로 값을 넣어두면 됨.

    val a:Int = 10+53-7
    println(a)

    val b : Int = 43+75+a
    println(b)

    total = a+b
    println(total)


    var variable = 10 + 12 - 5 // 다음과 같이 Int를 제외하고 바로 피연산자를 연산자로 계산한 값을 넣어서 출력 가능.
    println(variable)

    var num : Int = 15-4*3
    var num2 : Int = 65%7
    var num3 : Double = 7.5/5 +22.25
    var num4 : Double = num / num2 + 0.7

    println(num)
    println(num2)
    println(num3)
    println(num4)

    var a_1 = 10
    var b_1 = 5

    println(a_1++ + b_1)
    println(a_1)
    println(-- b_1)



}