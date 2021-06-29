package `128_ex_pair`

// chap 128. Pair 클래스 : 두 변수를 하나로 묶기
// Pair 클래스를 이용하면 두 변수를 하나로 묶을 수 있다.
// data class Pair<out A, outB>(
//        val first:A,
//        val second : B) : Serializable
// Pair 클래스는 제네릭을 이용하여 두 가지 타입의 값을 보관한다.

// 두 수의 몫과 나머지를 반환한다.
fun divide(a:Int, b:Int):Pair<Int, Int> = Pair(a/b, a%b)

fun main (args:Array<String>)
{
    val(q, r) = divide(10, 3)
    println("몫:$q")
    println("나머지:$r")
}
// divide 함수의 반환 타입이 Pair<Int, Int> 임에 주목하자 a와 b의 몫과 나머지를 Pair 객체로 묶어서 반환하고 있다.
// Pair 클래스는 데이터 클래스이므로 이렇게 여러 변수로 분해할 수 있다.