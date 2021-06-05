package `76_ex_safe_call_operater`

import ex_member_function.Building

// chap 76. 안전한 호출연산자 (safe call operater, ?.)
// Nullable한 참조 변수의 프로퍼티와 멤버 함수가 접근하려면, 대신 ?. 연산자를 반디스 사용해야 한다.
// ?. 는 null 값에 안전한 연산자이다. 아래와 같은 코드가 있을 때, 참조 변수가 null 이면 '참조변수?.프로퍼티' 표현식이 null 값을 갖게 된다.
// 멤버함수도 '참조변수?.멤버함수()' 형식이면 null 값을 갖게 된다.

fun main(args:Array<String>){
    var obj : Building? = null
    obj?.print()
    obj?.name = "건물"

    obj = Building()
    obj?.name = "서울월드컵경기장"
    obj?.date="2001년11월10일"
    obj?.area = 21_6712
    obj?.print()

    // Building 타입의 참조변수에 null을 지정
    // obj에는 null이 지정되어있으므로 print() 호출은 무시
    // obj?.print() 표현식의 값은 null, 타입은 Unit?이 된다.
    // obj에는 null이 지정되어 있으므로, 프로퍼티에 값을 집어넣는 동작 또한 무시됨.

}