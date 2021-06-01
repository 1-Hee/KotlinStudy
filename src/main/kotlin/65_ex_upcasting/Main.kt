package `65_ex_upcasting`

//chap 65. 업캐스팅
// 캐스팅=형변환 이란, 특정 타입을 다른 타입으로 변환하는 것을 뜻한다. 코틀린에서는 서브클래스이 인스턴스를 슈퍼클래스 타입으로 가리킬 수 있다.

open class Person(val name:String, val age:Int)

class Student(name:String, age:Int, val id: Int): Person(name, age)

fun main(args:Array<String>)
{
    val person : Person = Student("John", 32, 20171218)

    // person, Student 클래스를 이전 강의에서 쓰던 것을 그대로 가져옴
    // Student의 인스턴스를 생성, Person 타입의 참조변수로 가리키고 있음
    // Student 클래스는 PErson 클래스의 모든 프로퍼티와 멤버함수를 포함하기 때문에 이런일이 가능함/
}