package `83_ex_access_modifier_private`

// chap 83. 접근지정자:private
// 각 케이스별로 private 접근 지정자의 효과를 살펴보자

private var num = 10 // Test.kt 파일 내에서만 접근 가능

private fun print() // Test.kt 파일 내에서만 잡근 가능
    = println(num)

public fun hello(value:Int) // 어디에서나 자븐 가능
{
    num = value
    print()
}

public class Person(age:Int) // 어디에서나 접근 가능
{
    // 디폴트 Setter를 private로 지정. Setter는 Person 클래스 내부에서만 접근 가능.
    public var age = age
    private set
    // Getter를 public으로 지정. Getter는 어디에서나 접근 가능
    public val isYoung public get() = age < 30

}