package `89_ex_companion_object`

//chap 89. 동반자 객체(Companion Object)
// 동반자 객체(Companion Object)는 클래스 안에서 포함되는 이름 없는 객체이다.
// 어떤 클래스의 모든 인스턴스가 공유하는 객체를 만들고 싶을 때 사용한다.

class Person private constructor()
{
    companion object // 동반자 객체를 정의, 동반자 객체 정의할 대에는 이름없이 companion만 적음.
    {
        fun create():Person // person의 인스턴스를 생성하는 멤버 함수, 인스턴스를 반환하면서 지금까지 생성한 인스턴스의 개수를 세고 있음.
        {
            countCreated += 1
            return Person()
        }
        var countCreated = 0 // 생성된 Person의 인스턴스를 집계하기 위한 프로퍼티, 외부에서 함부로 값을 조작하는 것을 방지하기 위해 setter 의 접근 지정자를 prviate로 함.
            private set

    }
}

fun main(args:Array<String>)
{
    val a = Person.create() // 동반자 객체는 자신이 속한 클래스의 이름으로 접근할 수 있음. 즉 Person이라는 식별자는 Person 클래스의 동반자 객체로 인식.
    val b = Person.create()
    println(Person.countCreated)
}

// 동반자 객체에 접근하는 또다른 방법
// 어떤 클래스 안에 동반자 객체를 정의해 놓으면 companion이라는 식별자가 자동으로 생김. 따라서 Person.create()는 Person.Companion.create()로도 호출 가능
// ststic을 대체하는 동반자 객체
// 코틀린에선 static 키워드가 더이상 존재하지 않는다.
// 따라서 static의 효과를 얻고 싶으면 동반자 객체를 사용해야 한다.