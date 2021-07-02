package `134_ex_progression_practice`

//chap 134. Progression과 관련된 함수
// 코틀린에서 제공하는 확장 함수를 이용하면 Progression 타입들을 제대로 활용할 수 있다.

fun IntProgression.print()
{
    print("first:${this.first},")
    print("last:${this.last},")
    print("step:${this.step}")

    for (i in this)
        print("$i")
    println('\n')
}

// 편의를 위해 IntProgression의 상태를 출력하는 함수를 선언했다.


fun main(args:Array<String>)
{
    val prog:IntProgression = 7 downTo 3 // downTo는 연순으로 진행하는 Progression을 반환하는 infix 확장함수이다.
    prog.print()

    val prog2:IntProgression = (3..7).reversed() // reversed 확장함수는 원래 Progression을 뒤집는 역할을 한다 .즉 3~7로 진행되는 Progression에 reversed를 호출하면 7~3으로 진행되는 Progression을 새로 생성하여 반환한다.
    println(prog == prog2)
    prog2.print()

    val prog3:IntProgression = (1..3) step 3 // step 확장함수는 원래의 Progression에 step 프로퍼티 값만 바꿔주는 역할을 한다.
    prog3.print()

    val prog4:IntProgression = 10 downTo 2 step 3
    prog4.print()

    val prog5:IntProgression = 2 until 5 // Until은 [시작, 끝)로 진행하는 Progression을 반환하는 확장함수이다.
    prog5.print()



}