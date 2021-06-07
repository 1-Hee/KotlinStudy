package `81_ex_downcasting`

import ex_constructor.Person

//chap 81. as 연산자와 다운캐스팅
// 다운캐스팅(Downcasting)은 업캐스팅과는 반대로 슈퍼클래스 타입을 서브클래스타입으로 받는 것을 뜻한다.

fun main(args:Array<String>){
    val person:Person = Student("John",32,20171218)
    val person2:Person = Person("Jack", 29)


    var person3:Student= person as Student
    person3 = person2 as Student

}
// 14번줄의 person2 참조변수를 Student 타입으로 캐스팅하고 있다.
// person2 참조변수는 person의 인스턴스를 가리키므로 ClasCastException 예외가 발생하며 캐스팅에 실패한다.
// 캐스팅에 실패했을 때 예외가 발생하는 것을 발생하고 싶으면 as? 연산자를 대신 사용해야 한다.
// as? 연산자는 캐스팅에 실패하면 null을 돌려준다.
// 예를들어 person2 as? Student 표현식의 타입은 Student?이고, 캐스팅에 실패하면 null을, 성공하면 Student  타입으로 변환된 객체를 반환한다.



class Student(name: String, age: Int, ID: Int) : Person(name, age) {
}
