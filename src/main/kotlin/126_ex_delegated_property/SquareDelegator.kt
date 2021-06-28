package `126_ex_delegated_property`

import kotlin.reflect.KProperty

class OnlyPositive

{
    private var realValue:Int = 0

    operator fun getValue(thisRef:Any?, property:KProperty<*>):Int
    {
        return realValue
    }
    // 프로퍼티를 대리하는 객체는 operator fun getValue(~~)와 operator fun setValue 멤버함수를 갖고 있어야 한다.
    // 여기서 T는 대리할 프로퍼티의 타입이다.

    // Sample 클래스의 number 프로퍼티의 Getter는 OnlyPositive의 getValue로 대체되고, Setter는 OnlyPositive의 setValue로 대체된다.

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value:Int)
    {
        realValue = if (value > 0 ) value else 0
    }


}