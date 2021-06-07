package `79_ex_smart_casts`

// chap 79. 스마트캐스팅
// 특정조건을 만족하는 경우 컴파일러는 변수의 타입을 다른 타입으로 자동 캐스팅한다.
// 이를 스마트캐스팅(smart casting)이라고 부른다.

fun main(args:Array<String>){
    val number:Int? = null
    val number2 = 1225

    checkNull(number)
    checkNull(number2)
}

fun checkNull(any: Any?) {

    if(any==null)
    {
        println("null")
        return
    }
    println(any.toString())

}

// 특정 변수에 null 값이 들어있지 않다는 것을 완벽히 추론해 낼 수 있을 때, 그 변수는 자동으로 Not-null 타입이 된다.
// 그래서 any?.toString()이 아닌 any.toString()으로 호출이 가능하다.

