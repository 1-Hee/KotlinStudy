package `114_ex_inherit_from_generic`

class Rectangle(val width:Int, val height:Int):Plusable<Rectangle> // Plusable에는 제네릭이 적용되어 있음으로, 타입인수를 전달해야 한다 여기서는 Rectangle의 타입을 전달했다.
{
    override fun plus(other:Rectangle) =
        Rectangle(width + other.width, height + other.height) // Rectangle의 width와 height끼리 더한 결과를 반환하도록 plus를 오버라이딩 했다.
    // Plusable 인터페이스를 구현하면서 타입 인수를 Rectangle로 전달했으므로, 매개변수와 반환 타입을 Rectanlge로 했다.

    override fun toString() = "width:$width, height:$height"
}