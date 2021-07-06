package `137_ex_list_interface`

fun main(arg:Array<String>)
{
    val list: List<Double> = listOf(20.18, 1.14, 9.15, 1.14)
    // 테스트를 위해 List<Double> 타입의 객체를 생성하고 있다.

    println(list[0])
    //List의 0번째 원소 20.18이 출력된다.
    println(list.indexOf(1.14))
    // 1.14와 일치하는 '첫'원소의 인덱스인 1이 출력된다.
    println(list.indexOf(9.31))
    // 9.31에 해당하는 원소는 list에 존재하지 않으므로 -1이 출력된다.
    println(list.indexOf(1.14))
    // 1.14와 일치하는 ' 마지막' 원소인 인덱스인 3이 출력된다.
    println(list.subList(0,3))
    // 0번 ~2번 인덱스에 해당하는 원소를 뽑아 새 List를 만든 뒤, 이를 출력하고 있따.
}