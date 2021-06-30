package `130_ex_triple`

// chap 130. Triple 클래스 : 세 변수를 하나로 묶기
// Triple 클래스를 이용하면 세 변수를 하나의 변수로 묶을 수 있다.
// data class Triple<out A, out B, out C>(
// val first: A
// val second: B,
// val third: C) : Serializable

// Triple 클래스는 제네릭을 이용하여 세 가지 타입의 값을 보관한다.

// 원의 지름, 원주, 넓이를 반환한다.
fun calculateCircle(radius:Int):Triple<Int, Double, Double> //  calculateCircle 함수의 반환타입이 Triple<Int, Double, Double> 임에 주목하자
= Triple(radius *2, radius*2*3.14, 3.14*radius*radius) // 원의 지름, 원주, 넓이를 Triple 객체로 묶어서 반환하고 있다.

fun main(args:Array<String>)
{
    val (diameter, _, area) = calculateCircle(5) // Triple 클래스는 데이터 클래스이므로 여러 변수로 분해할 수 있고, 사용하지 않을 값을 _로 무시하고 있다.
    println("지름:$diameter")
    println("넓이:$area")

}

