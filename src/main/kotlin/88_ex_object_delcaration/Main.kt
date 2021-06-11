package `88_ex_object_delcaration`

// chap 88. 객체 선언
// 프로그램을 작성하다보면 프로그램 전체에서 공유할 수 있는 하나뿐인 객체가 필요할 때가 있다.
// 다음의 예제처럼 하면 그러한 객체를 쉽게 만들 수 있다.

object Person
{
    var name:String=""
    var age:Int = 0
    fun print()
    {
        println(name)
        println(age)
    }
}
// 클래스르 선언하든 객체를 선언중, 이렇게 하면 Person 이라는 식별자로 객체에 바로 접근할수 있음.

fun main(args:Array<String>){

    // 식별자 Person으로 객체에 바로 접근 가능
    Person.name = "Singleton"
    Person.age = 45
    Person.print()

}
// Person은 타입명이기도 하기 때문에 다음의 코드도 가능하다
// val person : Person = Person

// 싱글톤 패턴을 대체하는 object 키워드
// object 키워드 덕에 자바에서 작성해야만 했던 싱글톤 패턴 코드를 더이상 쓰지 않아도 된다.
// 그저 일반 클래스를 선언하듯, 프로그램 전체에서 단 하나만 존재하는 객체를 편하게 만들 수 있다.
