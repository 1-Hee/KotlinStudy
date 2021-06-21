package `113_ex_generic_to_class_and_interface`

// chap 113. 클래스와 인터페이스에서 제네릭 사용하기

// 클래스왜 인터페이스에서도 제네릭을 적용할 수 있다.

fun main(args:Array<String>)
{
    val pair:Pair<Int, Double> // 제네릭이 적용된 클래스와 인터페이스에는 이름 옆에 <타입 인수>를 붙여야 한다.
    // 예제에서는 Int와 Double을 타입 인수로 지정했다.
    // Pair<Int, Double> 부분은 하나의 고융한 타입으로 취급된다. 따라서 Pair<Int,Int>와 Pair<Int,Double>은 서로 다른 타입이다.
    pair = Pair<Int, Double>(15, 9.12)  // 생성자를 호출할 대도 생성자 이름 옆에 <타입 인수>를 붙인다. 생성자의 인수 15, 9,12로부터
    // Int 와 Double 타입을 추론할 수 있으므로, <Int, Double>은 생략 가능하다.
    println(pair.toString())
}