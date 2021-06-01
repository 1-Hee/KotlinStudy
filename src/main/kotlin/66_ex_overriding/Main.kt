package `66_ex_overriding`
// chap 66. 오버라이딩(Overriding)
// 슈퍼클래스의 멤버함수와 시그니처가 동일한 멤버 함수를 서브클래스에서 선언하면,
// 슈퍼클래스 멤버함수의 동작을 덮어쓰기할 수 있다.
// 이것을 오버라이딩(Overridng)이라고 한다.

open class AAA
{
    open fun func() = println("AAA")
}

class BBB : AAA()
{
    override fun func()
    {
        super.func()
        println("BBB")
    }
}

fun main(args:Array<String>)
{
    AAA().func()
    BBB().func()
}

// func라는 멤버함수를 가지고 있는 클래스 AAA를 선언하고 있다.
// 멤버 함수도 클래스와 마찬가지로 오버라이딩을 허용하려면 open 키워드를 맨 앞에 붙여주어야 한다.