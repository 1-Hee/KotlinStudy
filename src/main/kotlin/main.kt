import java.util.*
import javax.swing.text.StyledEditorKit

typealias Number = Int
var county = 0 //chap 36.
var ak = 5 //chap 37.

// Kotlin에서 fun=함수 를 의미함, java와 달리 class가 필요가 없어서 Hello world를 출력할때도 훨씬 깔끔한 것이 특징임.
fun main(args: Array<String>):Unit { // 왼쪽의 형식이 가장 기본적인 코틀린의 구조(함수)이다.

    println("Hello World!") // Kotlin에서는 ;이 필수가 아니다, 붙여도 출력되고 없어도 출력된다. 세미콜론(;)은 주로 한문장에 두개 이상 쓸대 사용.

    53 + 62 - 126 // Kotlin에서는 단순히 숫자만 이용해 연산을 해도 연산은 가능함.

    println(53 + 62 - 126)


    var total: Int // Kotlin의 변수선언형식, [ 변수(var) 변수이름 : 변수타입(Int 등) ] 으로 함
    total = 0 // 변수에 값을 넣을 때에는 [ 변수 = 0 ]의 형식으로 값을 넣어두면 됨.

    val a: Int = 10 + 53 - 7
    println(a)

    val b: Int = 43 + 75 + a
    println(b)

    total = a + b
    println(total)


    var variable = 10 + 12 - 5 // 다음과 같이 Int를 제외하고 바로 피연산자를 연산자로 계산한 값을 넣어서 출력 가능.
    println(variable)

    var num: Int = 15 - 4 * 3
    var num2: Int = 65 % 7
    var num3: Double = 7.5 / 5 + 22.25
    var num4: Double = num / num2 + 0.7

    println(num)
    println(num2)
    println(num3)
    println(num4)

    var a_1 = 10
    var b_1 = 5

    println(a_1++ + b_1)
    println(a_1)
    println(--b_1)

    val a_2: Byte = 125
    val b_2: Short = (100 + 200) * 100
    val c: Int = 1243546538
//    c = 0xFF_88_88
//    c = 0b01010010_01100011_01110101_01000101
    var d: Long = 1234

//    c = a + b
    d = c + 10L // 정수 리터럴 뒤에 :을 붙이면 그 리터럴은 수의 크기에 상관없이 무조건 Long 타입이 됨.
    var e: Float = 67.6f
    val f: Double = 658.456
    e = (e + f).toFloat()
    println(e)

    //chap 10.

    // 실수타입에서 예를 들어 0.1을 3번 더하는 코드를 다음과 같이 만들었다고 해보자,
    println(0.1f + 0.1f + 0.1f)

    // 여기서 0.1을 10번 더하는 코드를 다시 만들어보자, 이 경우에는 두가지 방법(덧셈나열, 곱셈이용) 으로 표현 가능한데,
    println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f) // 다음과 같이 덧셈으로 표기한 경우와
    println(0.1f * 10) // 다음과 같이 곱셈으로 간단히 표현한 경우이다.
    // 위의 코드를 실행할때는 위의 두줄의 결고가 서로 다른데 그이유는, 실수의 함정이 존재하기 때문, 0.1이라는 값을 이진수로 표현할때,
    // 소수점이 정확히 나누어 떨어지지 않는 무한소수가 되기 때문에 표현할 수 있는 범위에서 가장 근사한 값인 0.1000~~으로 바뀌어 저장된다.
    // 따라서 잘못된 값을 저장하게 되는데, 그렇지 않더라도 가끔 운이 좋은 경우에는 제대로 표현되기도 한다.

    // chap 10.

    var ch: Char = 'A'
    println(ch)

    ch = '\uAC00' // 문자 변수에 코드를 넣어서 글자를 나타나게 하는 것이 가능., 코틀린에서는 [유니코드]를 사용함.
    println(ch)

    ch = '한'
    println(ch.toInt()) // 문자를 숫자값으로 변환 가능.

    //chap 11.

    var str: String = "Hello"
    println(str)

    str = str + "\n Kotlin!"
    println(str)

    println(str[8])

    val num1 = 10 * 5 + 3
    println(str + num1)

    // chap 12.

    val a2 = 10
    val b2 = 20
    println("a의 값은 : $a2 ") // 출력하는 문자열 사이에 $+변수명을 포함시키면 해당 변수의 값으로 바뀐다.
    println("b의 값은 : $b2 ")
    println("a+b = ${a2 + b2}") // 또한 중괄호를 통해서 여러 변수 사이의 사칙연산한 뒤의 값으로 치환 가능하다.

    // chap 13.
    // fun위에 참조.    typealias Number = Int으로 이미 존재하는ㅌ ㅏ입에 별명을 붙일 수 있음.

    val a3: Number = 10 // 원래는 Int로 타입을 설정해주어야 하지만, fun위에 typealias로 별명을 지정을 하였기에 Number가 Int로써 작동하였다.
    println(a3)

    //chap 15. 배정연산자

    var G: Int
    var H: Int

    G = 10 + 5
    H = 10

    G = 10 + 5
    H = 10

    H += G // H값에 G를 누적
    println(H)

    H %= 3 // H를 3으로 나눈 나머지를 H에 저장
    println(H)


    // cahp 16. 문장
    // 문장은 독립적으로 실행할 수 있는 코틀린 코드의 "조각"을 의미함.

    val NAM: Int
    NAM = 15

    println(
        NAM + 7 * 3
    )

    //위의 코드에서 문장은 총 3개이다.

    //chap 17. 비교연산자

    a == b // a=b면 true, 아니면 false
    a != b // a=b면 false, 아니면 true
    a > b // a>b면 true, 아니면 false
    a < b // a<b면 true, 아니면 false
    a >= b // a가 b보다 크거나 같으면 true, 아니면 false
    a <= b // a가 b보다 작거나 같으면 true, 아니면 false

    var isRight: Boolean = (10 + 70) > (3 * 25)
    println(isRight)

    isRight = false
    println(isRight)

    isRight = 30 == (10 + 20)
    println(isRight)

    isRight = 0.00001f == 0.005f * 0.0002f
    println(isRight)

    isRight = 3.0 * 5 + 2.7 <= 16
    println(isRight)

    // 비교연산자의 결과값의 타입은 Boolean임

    //chap 18. 논리연산자

    // 논리연산자 3대장
    // 1) && : a와 b가 모두 true면 true, 하나라도 false면 false
    // 2) || : a와 b중 둘중 하나라도 true면 true, 둘다 false면 false
    // 3) !a : a가 ture면 결과값은 false, a가 false면 결과값은 true

    val ae = 15
    val be = 17

    var bool: Boolean = (a - b < a + b) && (a == 15)
    println(bool)
    bool = !((ae + be) > (ae * 3) || (be - ae) > 0)
    println(bool)

    bool = !((a + b) > (a * 3) || (b - a) > 0)
    println(bool)

    // chap 19. 흐름제어 - 조건문(if)

    var az = 15
    val bz = 11
    if (a > b) {
        println("if안으로 들어옴")
        az -= bz // az의 값에 bz값을 뺀 다음 그 값을 az에 넣으시오.
    }

    println(az)

    // 만약 if문 뒤의 문장이 1개일경우, 중괄호({})를 생략할 수 있다.

    //chap 20. if문

    val ax = 10
    val bx = 5
    if (ax < bx)
        println("if")
    else
        println("else")

    if (ax > bx)
        println("a가 크다")
    else
        println("b는 a 이상이다")

    //chap 21. if와 else의 중첩

    val score = 88
    if (score >= 90) {
        println('A')
    } else {
        if (score >= 80) {
            println('B')
        } else {
            if (score >= 70) {
                println('C')
            } else {
                println('F')
            }
        }
    }

    //chap 22. if-else를 표현식으로 상요하기

    val value: Int = if (10 > 5) {
        println("10은 5보다 크다")
        10
    } else {
        println("10은 5보다 크지 않다.")
        5
    }
    println(value)

    // chap 23. 흐름제어 조건문, When
    val scoreA = 64
    when (scoreA / 10) {
        6 -> {
            println('D')
        }
        7 -> {
            println('C')
        }
        8 -> {
            println('B')
        }
        9, 10 -> {
            println('A')
        }
        else -> {
            println('F')
        }
    }

    println("test")

    // when은 java의 [switch-case]를 훨씬 업그레이드한 버전임.

    // chap 24. when을 표현식으로 사용하기
    val scoreB = 95

    val grade: Char = when (scoreB / 10) {
        6 -> 'D'
        7 -> 'C'
        8 -> 'B'
        9, 10 -> 'A'
        else -> 'F'
    }

    println(grade)


    //chap 25. 흐름 제어 - 반복문 while
    var i = 1
    while (i < 10) {
        println(i)
        i += 1
    }


    // chap 26. 흐름제어 - 반복문 - do while

    var j = 1
    do {
        println("실행됨")
    } while (j == 0)

    // 변수 j를 선언함과 동시에 초기화하고 있다.
    // 조건을 검사하는 부분이 맨 뒤로 옮겨졌으므로 do-while 블록이 적어도 한번은 무조건 실행된다.
    // while의 조건이 false이므로  do-while을 반복하지 않고 빠져나온다, 만약 조건이 true였다면, 다시 5번줄("println()")으로 실행흐름이 되돌아간다.


    // chap 27. 흐름제어 - continue

    var k = 0
    while (k < 0) {
        k += 1
        if (k % 2 == 0) // 짝수이면
            continue // continue이면 아래의 문장들을 모두 skip 한다. = 아래의 명령문을 실행하지 않는다.
        print(k)
    }


    // chap 28. 흐름제어 break

    var l = 0
    while (true) {
        l += 1
        if (l >= 5)
            break // 이문장이 실행되는 순간 while 블록을 탈출한다.
        println(l)
    }

    // chap 29. Label

    var x = 0
    var y = 0

    while (x <= 20) {
        y = 0
        while (y <= 20) {
            if (x + y == 15 && x - y == 5)
                break
            y += 1
        }
        x += 1
    }

    println("x:$x, Y:$y")

    // break는 반복문을 빠져나올때 가장 가까운 반복문 '하나만'을 빠져나온다,
    // 코틀린은 레이블(Label)이라는 문법을 제공하여 이와 같은 문제를 해결할 수 있도록 해준다.


    // chap 31. 매개변수와 인수

        println(cToF(30))
        println(getAverage(89, 96))


    //

    // chap 32. unit 타입
    // celsiustoFah 에서 바로 계산결과를 println으로 출력하도록 수정했다. 이런 구조를 취하면 함수에서 굳이 값을 반환해줄 필요가 없다.

    celsiustoFah(27)


    // chap 33. 디폴트 인수

   println(getAverage(89, 96))
    getAverage(100, 50)
    println(getAverage(90))
    getAverage(66, print = true)
    getAverage(print=true)
    getAverage(print=true, M= 10, N= 30)

    // 매개변수를 선언과 동시에 초기화하고 있음. 이렇게 하면 함수 호출시 해당 매개변수에 인수를 지정하지 않아도 됨.


    // chap 34. 가변인수

    println("이 아래부터 34장입니다.")
    println(getSumOf(1,2,3,4,5,6,7))
    println(getSumOf(32, 57, 12))
    println(getSumOf())

    //chap 36. 지역변수와 전역변수

    println("36장")

    val ah = 15
    println(ah) // 블록 안에서 선언한 변수는 블록 밖으로 나가면 사라진다(함수의 매개변수도 포함)
    // 이렇게 블록 안에서 선언된 변수를 지역변수(Local Variable)라고 한다.

    county +=1
    printCount() // 함수의 밖에서 함수를 선언하고 있다. 이렇게 함수 밖에서 선언한 변수는 함수 호출이 끝나도 사라지지 않는다.
    // 이처럼 함수 밖에서 선언한 변수를 전역변수(Global Variable)이라고 한다.
    println(county)

    // chap 37. 지역변수와 전역변수가 중복될 때
    println("----37장----")
    val ak = 30 // 메인함수 위에 var ak = 5로 전역변수를 선언했다. 하지만, 코틀린에서는 전역변수와 지역변수간에 이름중복을 허용하므로 오류는 발생하지 않는다.
    println(ak) // 변수 ak 값을 출력할때, 현재 실행되고 있는 코드와 가장 가까운 스코프의 변수 즉 main함수의 변수가 우선적으로 인식된다.
    // 때문에 ak라는 식별자를 적으면 메인함수의 ak로 인식한다. >> 지역변수 ak = 30이 출력된다.
    func() // 이 경우 스코프에 걸리는 ak 변수가 전역변수 ak 뿐이므로 전역변수 ak = 5가 출력된다.

    // chap 38. 지역변수와 다른 함수의 지역변수가 중복될 때
    println("--38장---")

    // key word! : 스코프 : Scope(유효범위), 프로그래밍에서 매개 변수의 생존기간을 의미한다.
    // 프로그래밍 언어에서 scope은 변수와 매개변수의 생존 기간을 제어
    //scope는 이름이 충돌하는 문제를 줄여주고, 자동으로 메모리를 관리 하기 때문에 프로그래머에게 중요한 개념.
    //본래 자바스크립트에서는 block scope(scope 종류 참조)이 없다. 자바스크립트에서는 function scope이 존재.
    //자바스트립트에서는 함수에서 사용하는 모든 변수를 함수 첫 부분에서 선언 하는 것이 최선의 방법. -->> 자바에서 프로그래밍 작성할때, 맨 앞에 변수 타입, 변수 뭔지 선언한하는걸 의미함.
    //유효범위 개념을 잘 알고 있다면 변수와 매개변수의 접근성과 생존기간을 제어할 수 있다. << -- 중요함!

    val al = 52
    println(al)

    printA() //
    printA2() // 본 프로그램에서, println(al)과 printA(), printA2()는 같은 매개변수 al을 갖지만 printA()와 printA2()는
    // 본인의 클래스 안에서 변수를 선언하므로, 지역변수가 겹치지 않아 충돌이 발생하지 않는다.

    // val al = 66
    // println(al)

    // 주석처리된 위의 프로그램을 주석을 풀어보면 바로 윗 프로그램에서 지역변수가 겹치므로 빨간색 밑줄이 생기고 충돌(오류)가 발생한다.



    // chap 39. 지역함수
    fun printFomular(a:Int, b:Int) // 크게보면 fun main 함수에 안긴 형태의 지역함수를 선언한다, 변수로는 a와 b가 있고 Int 타입이다.
    {
        println(a*b + a-b) // 입력받은 변수에 대한 연산을 수행한다
    }
    println("--39장--")
    printFomular(73, 1) // println()처럼 main 함수에서 간단히 인수만 함수안에 추가하여 연산가능하다.
    printFomular(4, 6)

}

fun printA2() { // chap 38.
    val al = 120
    println(al)
}

fun printA() { // chap 38.
    val al = 17
    println(al)
}

fun func() { // chap 37.
    println(ak)
}

fun getSumOf(vararg numbers:Int): Int { // chap 34.
    // 매개변수 앞에 vararg 키워드를 붙이면 여러 개의 인수를 받을 수 있게 됨.

    val count = numbers.size
    // count에 인수의 개수를 저장, size의 데이터 타입은 Int 이다.
    var i = 0; var sum = 0
    //변수 i를 선언함과 동시에 0으로 초기화하고 있음.

    while (i < count) {
        sum += numbers[i] // sum에 가변 매개변수 numbers에 들어있는 값들을 누적함.
        i += 1
    }
    return  sum

    // Chap 35.

    println()
    // Ctrl을 누른채로 println()의 println부분을 클릭하면 Console.kt로 이동함.
    // println()도 함수의 일종임
    // Console.kt로 이동하면 다음과 같은 코드가 나오게 되는데,

// @kotlin.internal.InlineOnly <<- 어노테이션이라고 부르는 부위임.
    //  public actual inline fun println() {
    //    System.out.println()

    // println의 소스코드를 자세히 보면 매개변수 타입만 다르고, 함수의 이름은 모두 println인 것을 확인 가능하다.
    // 코틀린에서는 함수 시그니처가 다르기만 하면 함수 이름의 중복을 허용한다.
    // 이렇게 이름이 같은 함수를 여러개 선언하는것 = 함수 오버로딩이라고 한다.
    // 단, 반환타입은 서로 달라야한다, 예를들어 시그니쳐가 (Int, Double) -> Unit 인 함수와 (Int, Double) → Int인 함수는 오버로딩이 불가능하다.

}

fun printCount() {
    println(county) // 함수를 메인함수 밖에서 선언한 것이다.
    county += 1
}

fun getAverage(M:Int=0, N:Int=0, print:Boolean = false): Double { // chap 33.
    val result = (M+N)/2.0
    if(print)
        println(result)
    return result

}

fun getAverage(ai: Int, bi: Int): Double { //chap 32
    return (ai + bi )/ 2.0

}

fun cToF(celsius:Int): Double { //chap 31
    return celsius * 1.8 + 32

}

// 첫번째줄 cToF는 화씨온도를 계산하는 함수이다. 이때 cToF안의 변수 celsius는 본 함수의 매개변수이고, celsius를 계산하기 위해 사용된 숫자 "30"은 인수이다.
// 어떤 함수에서 수학식을 사용하 계산하는 것을 구현할 때에는, 매개변수와 인수의 타입(Int인지, Double인지)이 서로 같아야 한다.
// 기본적으로 함수는 코틀린을 처음 실행하고 보통 자동으로 입력된 fun main~ 이외에 fun ~~ 등의 형식을 통해서 특정 기능을 갖는 함수를 변수 하나로
// 축약하여 메인 함수에서의 응용이 가능하게 해주므로, 코딩을 할 때에 굉장이 유용한 기능 중 하나이다.

fun celsiustoFah(i: Int):Unit {
    val celsius = 27
    println(celsius *1.8+32)
}






