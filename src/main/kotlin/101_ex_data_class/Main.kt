package `101_ex_data_class`

//chap. 101 데이터 클래스
// 클래스에는 크게 데이터 자체의 역할만 하는 클래스와, 데이터를 다루는 역할은 클래스가 있다.
// 사원 데이터 자체만 속성으로 갔고 있는 Employee 클래스와, Employee의 인스턴들을 관리하는 EmployeeManager  클래스 같은 식으로 말이다.
// 코틀린은 데이터에 특화된 클래스를 선언할 수 있는 문법을 제공하낟.

data class Employee(val name:String, val age:Int, val salary:Int)

fun main(args:Array<String>)
{
    val first = Employee("john", 30, 3000) // Employee의 인스턴스를 생성하고 있다.
    val second = Employee("Page", 24,5300)
    val third = first.copy()
    // data 키워드 덕에 자동으로 선언된 copy 멤버 함수를 호출하고 있다. copy 멤버 함수는 각 프로퍼티의 값을
    // 그대로 복사한 새 인스턴스를 반환한다. third 참조 변수에 first가 가리키는 인스턴스와 동일한 값을 갖는 인스턴스가 저장된다.


    println(first.toString()) // data 키워드 덕에 오버라이딩된 toString 멤버함수를 호출하고 있다.
    println(third.toString())
    println(first == second) // data 키워드 덕에 자동으로 오버라이딩된 equals 멤버함수를 호출, first와 second는 서로 프로퍼티의 값이 다르므로 false가 출력
    println(first == third) // first와 third는 프로퍼티의 값이 서로 모두 같으므로 true가 출력
}

// 클래스를 데이터 클래스로 선언하면, 다음과 같은 이점이 생긴다.
// Any 클래스에 들어 있는 equals, hasCode, toString 멤버함수가 자동으로 오버라이딩 된다.
// equals 멤버함수는 각 프로퍼티의 값이 서로 모두 같으면 true, 하나라도 다르면 false를 반환하게 오버라이딩 된다.
// toString 멤버함수는 "Employee(name=..., age=...,salary=...)"의 형식으로 문자열을 반환하도록 오버라이딩 된다.
// 객체를 복사하는 copy 함수가 자동으로 선언된다.

// copy와 독같은 멤버 함수를 데이터 클래스에서 선언하면 충동오류 발생한다.
// 단 equals, hashCode, toStirng 멤버함수는 선언해도 괜찮다. 이들을 직접 선언하면 직접 선언한 멤버 함수로 오버라이딩 된다.
// 참고로, copy 멤버함수는 모든 매개변수가 디폴트 인수를 갖고 있기 때문에,
// first.copy(name="Jang")의 형식으로 원하는 프로퍼티만, 다른 값으로 지정한 채 복사할 수 있다.


// 데이터 클래스는 여러 가지 편의 기능을 제공하지만, 그만큼 제약사항이 많다.
// 클래스를 데이터 클래스로 선언하기 위해서는 다음의 규칙들을 지켜야한다.

// 적어도 하나의 프로퍼티를 가져야 한다.
// 생성자 매개변수에는 반드시 var이나 val을 같이 써야 한다.
// 즉, 프로퍼티에 대응하지 않는 생성자 매개변수를 가질 수 없다.
// abstract, open, sealed, inner 키워드를 붙일 수 없다.
// 인터페이스만 구현할수 있다. 단 코틀린 1.1버전부터는 sealed 클래스도 상속 가능하다.
// component1, component2와 같은 이름으로 멤버함수를 선언할 수 없다.
// 컴파일러가 내부적으로 사용하는 이름이기 때문이다.