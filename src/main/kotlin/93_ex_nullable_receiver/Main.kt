package `93_ex_nullable_receiver`

fun String?.isNumber() // 리시버 타입에 ?가 붙어 있는 것을 볼 수 있다. 이것이 바로 Nullable 리시버이다.
{
    if(this == null)
        println("문장열이 Null 입니다.")
}

fun main(args:Array<String>)
{
    val empty:String? = null // empty는 String? 타입이고, null이 지정되어 있다.
    empty.isNumber() // isNumber 확장함수의 리시버 타입이 Nullable이기 때문에, 표현식의 값이 null 이어도 isNumber 확장함수를 호출할 수 있다.
}