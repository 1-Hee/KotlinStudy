package `127_ex_class_delegation`

fun main(args:Array<String>)
{
    println(Sample() + 10)
}
// Sample() +10을 수행하면 ClassDelegator의 plus가 호출된다.