package `126_ex_delegated_property`

fun main(args:Array<String>)
{
    val sample = Sample()

    sample.number = -50
    println(sample.number)

    sample.number = 100 // aaa.number = 10가 실행되는 순간, OnlyPositive의 setValue가 호출된다.
    // OnlyPositive의 realValue에 0이 저장된다.
    println(sample.number)
}