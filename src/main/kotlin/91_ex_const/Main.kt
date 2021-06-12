package `91_ex_const`

//chap 91. const
// inline 함수와 비슷하게 val 변수 앞에 const 키워드를 붙이면 변수에 접근하는 코드를 변수에 저장된 값으로 대체시킨다.

const val hello = "Hello" + "World!" // 전역변수 hello에 const 키워드를 붙였다.
// const 키워드는전역변수, 오브젝트의 프로퍼티 등에 붙일수 있다.
// 프로그램 어디서나 바로 접근할 수 있는 변수에 붙일 수 있다고 생각하면 된다.
// const가 붙은 변수에는 리터럴로 이루어진 표현식만 저장이 가능하다.

object Foo
{
    const val bar = "bar" // 오부젝트 bar 프로퍼티에 const 키워드를 붙였다.
    //여기에도 마찬가지로 리터럴로 이루어진 표현식을 저장했다.
}
fun main(args:Array<String>)
{
    println(hello)
    println(Foo.bar)
    println(hello)
    println(Foo.bar)
}