package `120_ex_array`

// chap 120. 배열
// 배열은 타입이 같은 변수를 여러개 만들때 사용하며, 다음과 같이 선언되어 있다.

// class Array<T>
// {
//  val size :Int
//  operator fun get(index:Int):T
//  operator fun set(index:Int,value:T):Unit
//  operator fun iterator():Iterator<T>
// }

// size 프로퍼티는 배열의 원소 개수를 나타낸다.
// get/set 연산자 멤버 함수는 배열을 [] 연산자로 접근할 수 있게 해준다.
// iterator 연산자 멤버 함수는 배열을 for 문에 쓸 수 있게 해준다.

fun main(args:Array<String>){
    val integers:Array<Int> = arrayOf(10, 20, 30, 40)
    // 배열은 arrayOf 함수를 통해 만들 수 있다. arrayOf는 가변 인수를 받을 수 있도록 되어 있으며, 제네릭이 적용되어 있다.
    // 여기서는 인수가 모두 Int 타입이므로 타입 인수를 생략했다.
    // arrayOf 함수가 호출되면 힙 여역에 10, 20, 30, 40이 생성된다.

    println(integers.size)  // integers 배열의 원소 개수 4가 출력된다.
    println(integers[1]) // 배열으 ㅣ1번째 원소를 출력하고 있다. 20이 출력된다.

    for (i in integers) // for 문을 통해 배열의 각 우너소를 순회하며 출력하고 있다. 10, 20, 30, 40이 출력된다.
        print("$i")
}