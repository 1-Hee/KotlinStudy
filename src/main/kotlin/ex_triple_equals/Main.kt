package ex_triple_equals

fun main(args:Array<String>)  {

    // chap 51. ===, !== 연산자

    var a = "one"
    var b = "one"

    println(a === b)

    b = "on"
    b += "e"

    println(a !== b )

    b = a

    println(a === b)

    // 연산자는 두 참조 변수가 같은 객체를 가리키고 있는지 여부를 조사하는 연산자이다.
    // 참조변수 1 === 참소변수 2 형태로 쓰면, 두 참조변수가 같은 객체를 가리킬 대 true, 다를때 false이다.
    // !== 는 같지 않다이고, 다를때 true, 같을 때 false 이다.


}