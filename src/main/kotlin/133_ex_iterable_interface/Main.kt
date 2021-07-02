package `133_ex_iterable_interface`

fun main(args:Array<String>)
{
    val prog:IntProgression = 3..7 // IntRange 타입의 표현식을 IntProgression 타입의 변수로 받고 있따.
    println(prog.first) // IntProgression의 각 프로퍼티를 출력하고 있다.
    println(prog.last)
    println(prog.step)

    for (i in prog) // IntProgression을 for문의 in 연산자에 적용했다.
        // IntProgression 타입은 iterator 연산자 렘버함수를 갖고 있으므로, 이렇게 IntProgression 타입만으로 for문을 사용할 수 있다.
            // 단, Int Progression 타입은 contains 연산자 멤버 함수를 갖고 있찌 않으므로 일반적인 in 연산자에 사용하는 것은 불가능하다.
        print("$i") // 34567이 출력된다.
}