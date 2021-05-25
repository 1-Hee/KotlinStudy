package ex_this_duplication

// chap 53. 프로퍼티와 멤버함수의 매개변수 일므이 중복될 때

class AAA {

    var num = 15

    fun memberFunc(num:Int){
        println(num)
        println(this.num)
    }

    // 멤버함수의 매개변수와 프로퍼티의 이름은 중복될 수 있다.
    // 위의 클래스에서 클래스 안에서 사용하는 변수 num과, 내장함수에서 사용하는 num의 변수명이 같다.
    // 프로퍼티와 멤버함수의 매개변수이름이 중복되더라도 오류는 발생하지 않는다.
    // 변수이름을 그냥 적이면 이 변수는 매개변수로 인식된다.

}

fun main(args:Array<String>) {

    val a = AAA()
    a.memberFunc(53)

}