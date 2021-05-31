package `64ex_inheritance`

// chap 64. 상속(Inheritance)

open class Person(val name:String, val age : Int)

class Student(name:String, age:Int, val id:Int):Person(name, age) // :Person() 이부분이 java에선 extends로 했어야 할 상속이다.

fun main(args:Array<String>)
{
    val person = Person("홍길동", 35)
    val student = Student("김길동", 23, 20171217)

    // 상속은 기존에 존재하는 클래스를 확장하여 새로운 클래스를 정의하는 기법이다.
    // name과 age 프로퍼티를 갖는 Person 클래스를 정의하는데, 이 클래스를 상속하여 새로운 클래스인 Student를 정의하려고 한다.
    // 기본적으로 코틀린에서는 클래스는 상속이 막혀있다. 상속을 허용하려면, 클래스 정의부 앞에 open 키워드를 붙여주어야 한다.
    // 코틀린은 자바와 달리 클래스 선언이 기본적으로 "final"로 되어 있다.

    // 상속을 할 때는 반드시 슈퍼클래스의 생성자를 호출해야 하므로, Student의 생성자 매개변수에 name과 age를 추가하여 Pereson 생성자에 전달함.
    // 상속문법을 정리하면 아래와 같음
    // class 클래스 이름 : 슈퍼클래스 생성자(인수)


}