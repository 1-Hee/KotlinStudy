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

    val a_2 : Byte = 125
    val b_2 : Short = (100+200)*100
    val c : Int = 1243546538
//    c = 0xFF_88_88
//    c = 0b01010010_01100011_01110101_01000101
    var d : Long = 1234

//    c = a + b
    d = c+ 10L // 정수 리터럴 뒤에 :을 붙이면 그리터럴은 수의 크기에 상관없이 무조건 Long 타입이 됨.
    var e : Float = 67.6f
    val f : Double = 658.456
    e = (e+f).toFloat()
    println(e)

    println("안녕하세요 나는 조원희 입니다.")


    // 실수타입에서 예를 들어 0.1을 3번 더하는 코드를 다음과 같이 만들었다고 해보자,
    println(0.1f + 0.1f + 0.1f)

    // 여기서 0.1을 10번 더하는 코드를 다시 만들어보자, 이 경우에는 두가지 방법(덧셈나열, 곱셈이용) 으로 표현 가능한데,
    println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f) // 다음과 같이 덧셈으로 표기한 경우와
    println(0.1f * 10) // 다음과 같이 곱셈으로 간단히 표현한 경우이다.
    // 위의 코드를 실행할때는 위의 두줄의 결고가 서로 다른데 그이유는, 실수의 함정이 존재하기 때문, 0.1이라는 값을 이진수로 표현할때,
    // 소수점이 정확히 나누어 떨어지지 않는 무한소수가 되기 때문에 표현할 수 있는 범위에서 가장 근사한 값인 0.1000~~으로 바뀌어 저장된다.
    // 따라서 잘못된 값을 저장하게 되는데, 그렇지 않더라도 가끔 운이 좋은 경우에는 제대로 표현되기도 한다.


    var ch:Char = 'A'
    println(ch)

    ch = '\uAC00' // 문자 변수에 코드를 넣어서 글자를 나타나게 하는 것이 가능.
    println(ch)

    ch = '한'
    println(ch.toInt()) // 문자를 숫자값으로 변환 가능.

    var str : String = "Hello"
    println(str)

    str = str +"\n Kotlin!"
    println(str)

    println(str[8])

    val num1 = 10*5+3
    println(str+num1)







}