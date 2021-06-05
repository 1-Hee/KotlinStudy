package `77_ex_notnull_assertion_operater`

import ex_member_function.Building
// chap 77. Not-null 단정연산자 !!

// !! 연산자는 Nullable 타입을 Not-null 타입으로 강재로 캐스팅한다.

fun main(args:Array<String>){
    var obj: Building? = Building()
    obj!!.name = "서울시청"
    println(obj!!.name)

    obj = null
//    obj!!.print()
    // obj가 null이기 때문에 obj!!.print()는 KotlinNullPointerException 예외를 발생시킨다.
    
    
}