package `117_ex_range`

// chap 117. 연산자와 범위 표현식
// ..연산자는 범위를 표현하는 연산자이다.

fun main(args:Array<String>)
{
    val oneToTen:IntRange = 1..10
    // .. 연산자는 operator fun rangeTo(매개변수:자유 타입): 자유 타입으로 오버로딩할 수 있다.
    // Int 클래스에는 다음과 같이 rangeTo가 선언되어 있다.
    // operator fun rangeTo(other:Int):IntRange
    // 즉, 1..10은 1.rangeTo(10)으로 컴파일되며, IntRange 타입의 값이 반환된다.
    // IntRange는 특정한 정수 구간을 표현하는 클래스이다. 1..10은 1~10의 구간을 표현한다.

    println(5 in oneToTen)
    // IntRange 클래스는 contains 연산자 멤버 함수를 갖고 있기 때문에 in 연산자를 사용할 수 있다.
    // 표현식 5in 1..10은, 정수 5가 1~10 범위에 속해있는지 여부를 Boolean  타입으로 반환한다.
    // true 가 출력된다.

    val upperAtoZ:CharRange = 'A'..'Z'
    // char 타입에는 다음과 같이 rangeTo가 선언되어 있다.
    // operator fun rangeTo(other:Char):CharRange
    // 즉, 'A'..'Z' 'A'.rangeTo('Z)으로 컴파일되며, CharRange 타입의 값이 반환된다.
    // CharRange의 인스턴스는 특정한 문자 구간을 표현한다.

    if ('C' in upperAtoZ)
        println("대문자입니다.")
    // CharRange 클래스도 contains 연산자 멤버 함수를 갖고 있기 때문에 in 연산자를 사용할 수 있다.
    // 표현식 'C' in 'A'..'Z'는, 문자 'C'가 'A'~'Z'의 범위에 속해잇는지 여부를 Boolean 타입으로 반환한다.
    // 'C'의 유니코드는 67, 'A'의 유니코드는 65, 'Z'의 유니코드는 90이므로, 'C'는 'A'~'Z'에 속해있다고 할 수 있다.
    // '대문자입니다.'가 출력된다.

    // 'p'가 'a'~'z' 범위에 속하는지 여부를 출력하고 있다. '소문자입니다.'가 출력된다.


    if ('p' in 'a'..'z')
        println("소문자입니다.")
    // 어떤 값이 특정 범위에 들어있는지 조사할때 .. 연산자를 쓰면 좋다.
    // if(0 <= num && num <= 100)
    // 예를 들어, 위와 같이 쓰기 보다는, 아래와 같이 쓰는 것이 코드도 짧고, 읽기도 쉽다.
    // if(num in 0..100)
    // if(num in 0..100)은, '만약, num이 0~100에 있다면'으로 해석할 수 있어 훨씬 자연어에 가깝기 때문이다.
}

