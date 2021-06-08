package `83_ex_access_modifier_private`

fun main(args:Array<String>)
{
    // num = 5 // 에러발생
    // num은 private이므로 접근하면 오류 발생

    hello(15)
    // public이므로 접근 가능. hello 함수를 통해 num 전역변수의 값을 수정함.

    val person = Person(10)
    println(person.age)
    // age 프로퍼티는 public 이기 대문에 접근 가능하여 10이 출력

    //person.age = 20 // 에러발생
    // person 객체의 age 프로퍼티에 접근, age는 public이나 Setter는 private이어서 외부에서 값을 지정하지 못하고, 오류 발생함.

    println(person.isYoung)
    // person 객체의 isYoung은 public이므로 접근이 가능하여 true 출력

}