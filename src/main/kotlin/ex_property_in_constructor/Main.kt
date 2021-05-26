package ex_property_in_constructor

class Car(val name:String, val speed:Int = 0)

// 생성자 매개변수 앞에 val을 붙이고, speed 변수 에 디폴트 인수를 지정하여 생성자 + 프로퍼티 한번에 완성할 수 있다.

fun main(args:Array<String>) {
    val car = Car("My Car")
    println(car.name)
    println(car.speed)
}