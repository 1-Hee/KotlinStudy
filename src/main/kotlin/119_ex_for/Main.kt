package `119_ex_for`

//chap 119. 흐름제어-반복문 for
// for도 while과 같이 코드를 반복하는 반복문의 일종이다.
// 그러나 for는 특수한 상황에만 쓰이고 , 알아야 할 사전 지식도 많기 대문에 불가피하게 중급파트에서 소개하게 되었다.
// for은 다음의 형태로 쓴다.
// for(변수이름: 타입 in 표현식)
//{..}

// 코틀린의 for는 for-each 스타일만 지원한다. C 스타일의 전통적인 for은 지원하지 않는다.
//for 문의 소괄호 안에 선언된 변수는 스코프가 for 문 안으로 한정되며, in 우측 표현식 속의 데이터를 하나씩 받는데 사용한다.
// in 우측의 표현식에는 다음과 같은 연산자 멤버 함수를 갖는 객체만 지정할 수 있다.
// operator fun iterator():Iterator<자유 타입>
// 만약 for(변수이름: Double in 표현식) 형태로 사용하려 한다면, 표현식이 operator fun iterator():Iterator<Double> 형태의 연산자 멤버 함수를 갖고 있어야 한다.
// 즉, for 문 속의 변수 타입과 Iterator의 타입 인수가 같아야 한다.

// for 문 속의 in 연산자는 비록 in이라는 키워드로 되어있지만, 일반적은 in 연산자와 다르게 봐야 한다.
// contains 연산자 멤버 함수가 있어야 지원되는 일반적인 in 연산자와 달리, for 문 속의 in 연산자는 iterator 연산자 멤버함수만 있으면 지원되기 때문이다.
// 제네릭의 in과 마찬가지로 동음 이의 키워드로 생각하면 된다.

fun main(args:Array<String>){
    for (i:Int in 1..10)
        print("$i") // 1~10 이 출력된다.
    println() // 아무 인수도 전달되지 않아 줄바꿈만 수행한다.

    for (i:Int in 1..10)
    {
        if (i >5)
            break // for 문도 반복문의 일종이므로 break와 continue를 사용할 수 있다. 1~5까지만 출력되고 for문이 중단된다.

        print("$i")
    }
}

// IntRange 클래스에는 Iterator<Int> 타입을 반환하는 iterator 연산자 멤버 함수가 선언되어 있으므로,
// for 문의 in 연산자에 적용 가능하다. Iterator 타입 인수가 Int이므로, Int 타입과 호환되는 타입의 변수만 for 문의 소괄호 속에 선언할 수 있다.
// 6번줄은 총 10번 실행되며, for문 속 변수 i에는 1부터 10까지의 값이 매 반복마다 순서대로 입력된다.


