package `94_ex_extenstion_function_companion_object`

//chap 94. 동반자 객체의 확장 함수
// 확장함수를 다음과 같이 선언하면 동반자 객체에도 황작 함수를 달 수 있다.
// fun 클래스 이름.Companion.함수 이름()
//{
//}

class Person { companion object } // // 동반자 객체에 확장 함수를 주입하기 위해 빈 동반자 객체를 정의함

fun Person.Companion.create()=Person() // 동반자 객체에 create 함수를 주입하고 있음.

fun main(args:Array<String>)=Person.create() // Person 클래스의 동반자 객체에 주입된 create 함수를 호출하고 있다.



