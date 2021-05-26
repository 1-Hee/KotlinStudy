package ex_constructor

// chap 54. 생성자와 초기화 블록

class Person constructor(name:String, age:Int) {

    val name : String
    val age : Int

    init {
        this.name = name
        this.age = age
    }

    // 생성자 : 특정 클래스를 생성하면 그 클래스 안에 있는 변수 명으로 해서 함수가 자동으로 생성되는데
    // 이 함수를 생성자(constructor)라고 부른다.
    // 이때, 클래스 안의 변수에 각각 해당 타입의 변수값을 입력해주어야 하는데,
    // Init을 통해서 그 기능을 할 수 있다.
    // Init으로 변수가 뭔지 입력 없이 하면 오류뜬다.

}

fun main(args:Array<String>) {
    val person = Person("홍길동", 46)
    println("이름:${person.name}")
    println("나이:${person.age}")
}