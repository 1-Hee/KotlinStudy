package `115_ex_generic_specific_type`

interface ValueContainer
{
    fun getValue():Int
}

// getValue라는 멤버 함수를 갖는 인터페이스를 선언하고 있다.
class AAA : ValueContainer
{
    override fun getValue():Int = 1102
}

class BBB : ValueContainer
{
    override fun getValue():Int = 127
}