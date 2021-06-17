package `107_ex_higher_order_function`

//chap 107. 고차함수
// 여러 페이지에 걸쳐 함수 리터럴을 소개했지만, 아직 구체적 용도를 설명하지 않았다.
// 함수 리터럴은 보통 고차 함수를 위해 사용된다. 고차함수란, 인수로 함수를 받거나 함수를 반환하는 함수를 뜻한다 =>> 함수(함수) 요론 느낌
// 고차 함수는 다음의 코드와 같은 상황에 유용하게 사용할 수 있다.

fun decorate(task:() -> Unit) { // () -> Unit 타입의 함수를 인수로 받는 고차함수 decorate를 선언
    println("==작업시작==") // 작업을 시작하기 전과 후에 할 동작
    task() // task 매개변수가 가리키는 함수를 호출하고 있다.
    println("===작업끝===")
}

fun main(args:Array<String>){
    decorate({
        val a= 10; val b = 5
        println("$a + $b = ${a+b}")
    })
    decorate({
        println("some"); println("tasks")
    })
}
// decorate 함수에 함수 리터럴을 인수로 전달하고 있다.

// 어떤 함수를 호출하기 전/후에 수행해야 할 고정적인 작업이 있다면 고차 함수를 활용하자.

