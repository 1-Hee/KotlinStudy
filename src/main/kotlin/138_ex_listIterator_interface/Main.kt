package `138_ex_listIterator_interface`

private fun moveToNext(iter:ListIterator<Int>)
{
    print("${iter.hasPrevious()},")
    print("${iter.hasNext()},")
    print("${iter.previousIndex()},")
    print("${iter.nextIndex()}, ")
    println("${iter.next()}")

    // Iterator의 상태를 출력하고, 커서를 한 칸 옮기는 함수를 선언하고 있다.
}

fun main(args:Array<String>)
{
    val iter: ListIterator<Int> = listOf(10, 20, 30).listIterator()

    moveToNext(iter)
    // iter의 커서는 0번째 원소를 가맄리 예정이므로, false , true, -1, 0, 10이 출력된다.
    moveToNext(iter)
    // iter의 커서는 1번째 원소를 각리킬 예정이므로, true, true, 0, 1, 20이 출력된다.
    moveToNext(iter)
    //iter의 커서는 2번째 원소를 가리킬 예정이므로, true, true, 1, 2, 30이 출력된다.

}