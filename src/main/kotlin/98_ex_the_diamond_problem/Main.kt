package `98_ex_the_diamond_problem`

// 상속관계 그림이 다이아몬드를 닮아서 다이아몬드 문제라는 이름이 붙었다.
// 이 코드에 어떤 문제가 있는지를 살펴보자
// 일단 follow 추상 멤버 함수를 갖는 parent 인터페이스가 있고, Mother, Father 인터페이스에서 follow를 오버라이딩 하고 있다.
// Child 클래스는 Mother, Father 인터페이스를 모두 구현하고 있는데
// super.hello()를 하면 Mother의 follow가 호출될지 Father의 follow가 호출될지 애매하다.
// 코틀린은 이런 상황을 위해 원하는 인터페이스의 super를 호출할 수 있는 기능을 제공한다.

interface Parent {fun follow():Unit}

interface Mother:Parent
{
    override fun follow() = println("follow his mother")
}

interface Father:Parent
{
    override fun follow() = println("follow his father")
}

class Child:Mother, Father
{
    override fun follow()
    {
        println("A child decided to")
        super<Mother>.follow() // <>로 호출할 super 멤버함수를 지정하고 있다.
    }
}

fun main(args:Array<String>)
{
    Child().follow() // child의 인스턴스를 생성하고 곧바로 follow 멤버함수를 호출하고 있다.
}