package `80_is_operator`

import ex_constructor.Person

//chap 80. is 연산자
// is 연산자로 참조 변수가 실제로 가리키고 있는 객체의 타입을 알아낼 수 있다.

//상속예제의 Person, Student 클래스 재활용

class Professor(name:String, age:Int):Person(name, age)

fun main(args:Array<String>)
{
    val person:Person = Student("Mar Zuckerberg", 33, 20171225)
    println("${person is Person}")
    println("${person is Student}")
    println("${person is Professor}")

    val person2:Person = Professor("Kim", 48)
    println("${person2 is Person}")
    println("${person2 is Student}")
    println("${person2 is Professor}")
}

// Student의 인스턴스는 Professor타입으로 가리킬 수 없으므로, false가 출력된다.
// 코틀린의 is 연산자 = 자바의 instanceof
// is 연산자는 when에서 사용 가능하다.



class Student(name: String, age: Int, ID: Int) : Person(name, age) {
}
