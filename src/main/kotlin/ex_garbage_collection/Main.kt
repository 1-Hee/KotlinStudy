package ex_garbage_collection

fun main(args:Array<String>) {

    //chap 50. 가비지 컬렉션 (힙 영역에 문자열이 가득 쌓이는 문제를 해결하는 방법)

    // 힙영역은 매우 넓어서 , 객체의 위치를 기억하고 있는 참조 변수가 모두 사라져버리면 마치 사막 한가운데 볼펜을 떨어뜨린것과 같은 상황이 된다.
    // 객체는 분명 힙 영역 어딘가에 존재하지만 위치를 모르기에 다시는 찾을수 없다.
    // 이렇게 미아가 된 객체는 메모리 공간이 부족해질 정도까지 쌓이면 가비지컬렉션이라는 기능에 의해 소멸한다.
    // 가비지컬렉션은 '쓰레기 수거'라는 듯으로 미아 객체를 수거해가는 기능을 뜻한다.

    var result = ""
    var i = 1

    while ( i <= 100 )
    {
        result += "$i" // 코틀린에서 달러사인의 의미 :
        // 자바에서 println ("문자열" + 변수 ) 형식으로 어떤 문자를 연결하는 것과 같은 기능
        // 예컨데 "Hello, $name" 이런식으로 해도 합쳐진 문자열이 출력 됨.
        i += 1
    }

    println(result)

    //result , i를 이용해 변수를 ""와 1로 초기화하고 있다.
    // 반복만들 동원하여 총 100번의 문자열 덧셈을 하고 있다. 반복문을 마치고 나면 합에는 수백게의 미아객체가 존재할 것이다.
    // 언제인지는 확신할 수 없지만, 이렇게 많음 미아 객체가 힙에 쌓이면 적당한 시점에 시스템이 자동으로 가비지셀력선을 수행하여 쓰레기 객체를 수거해간다.

    // 가비지컬렉터 (한줄요약) : 시스템상의 메모리 과부하 방지를 위해 자바, 코틀린에서 자동으로 제공하는 패시브같은 메모리 청소 기능
    // 가비지컬렉터에 대한 자세한 설명 : https://mangkyu.tistory.com/118 참조

    // 가비지 컬렉션이 일어날 때에는 삭제할 미아 객체들을 탐색해야 하므로 순간적으로 프로그램이 멈추는 현상이 일어날 수 있다.



}