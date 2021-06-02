package `69_ex_object_extends_class`

// chap 69. 클래스를 상속하는 객체
// 클래스 없이 특정 클래스를 상속하는 객체를 만드는 법

open class Person(val name:String, val age:Int)
{
    open fun print()
    {
        println("이름:$name")
        println("나이:$age")
    }
}

fun main(args:Array<String>)
{
    val custom : Person = object : Person("Alan", 23)
    {
        override fun print() {
            println("It's a object")
        }
    }
    custom.print()
}

// 클래스 없이 객체를 만들때 쓰는 object 표현식으로도 상속을 할 수 있다.
// 상속 가능한 print 멤버함수를 갖는 Person 클래슬르 선언하고 있다.
// Person 클래스를 상속하는 object 표현식이다.
// 객체를 만들면서 어떤 클래스를 상속하려면 클래스 간에 상속하듯이 object 뒤에 ': 슈퍼클래스이름(생성자 인수)'를 붙여주면 된다.
// 클래스 없이 객체를 만들면서 상속을 했으므로 이때의 상속은 1회용이 된다.
// custom 참조 변수가 실제로 가리키고 있는 객체의 print 멤버함수가 호출된다.
// It's a object가 출력된다.
