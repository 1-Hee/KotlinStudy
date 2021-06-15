package `102_ex_desturcting_object`

//chap 102. 객체분해하기
// 데이터 클래스의 인스턴스에 한해, 객체를 여러개의 변수로 쪼개는 것이 가능하다.

data class Employee(val name:String, val age:Int, val salary:Int)

fun main(args:Array<String>)
{
    val(name, _, salary) =  Employee("John", 30, 3300)
    // Employee 는 데이터클래스이므로, Employee 타입의 표현식을 여러 변수로 쪼갤 수 있다.
    // name, _, salary 변수가 선언과 동시에 Employee의 프로퍼티 순서대로 초기화된다.
    // 어떤 객체에서 필요한 부분만 변수로 추출할 대 이 문법을 사용하면 좋다.
    // 사용되지 않는 변수의 이름은 언더스코어(_)를 지정하여 무시할 수 있다.
    println(name);println(salary)
}