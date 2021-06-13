package `96_ex_abstract_class`

// 단순히 학생, 교수, 직원 클래스를 하나의 타입으로 묶어주는 클래스
abstract class Person
{
    abstract fun getSalary():Int
}

// 학생 클래스, tuition는 한 학기 등록금
class Student(private val tuition:Int):Person()
{
    // 학생은 등록금을 납부하므로 salary를 음수 처리
    override fun getSalary() = -tuition
}

// 교수클래스, classCount는 진행하는 수업의 수
class Professor(private val classCount:Int):Person()
{
    override fun getSalary() = classCount * 200
}
// 학교 직원 클래스, initial은 초봉(반기), years는 경력(년)
class Employee(private val initial:Int, private val years:Int):Person()
{
    override fun getSalary() = initial * (1.0 + years / 10.0).toInt()
}

// 구성원으로부터 학교의 재정을 구함
fun getFinance(vararg persons:Person):Int // Student, Professor, Employee 타입이 상속관계에 의해 Person 타입으로 묶여있으므로, 여러 타입의 객체를 매개변수로 받을 수 있다.
{
    var i = 0
    var finance = 0
    while ( i < persons.size )
    {
        finance -= persons[i].getSalary()
        i += 1
    }
    return finance
}

fun main(args:Array<String>)
{
    val finance = getFinance(Student(330), Professor(1), Professor(2), Employee(1300, 2)) // 각 개체의 getSalary 멤버함수가 정상적으로 호출
    println("학교재정: $finance 만원")
}

// 클래스를 추상 클래스로 만드려면, 클래스 선언 맨 앞에 abstract 키워드를 붙인다.
// 추상 클래스는 일부 멤버의 내용이 비어있는 불완전한 클래스이기 때문에 객체를 생성할 수 없다.
// abstarct 키워드는 그 자체로 open을 포함하고 있기 때문에 open 키워드는 따로 적지 않아도 된다.
// 추상클래스는 추상 멤버함수를 가질 수 있다.
// 추상 멤버함수란, 내용이 없는 멤버함수를 말한다.
// 멤버함수 맨 앞에 abstarct 키워드를 붙이면 멤버 함수를 추상 멤버 함수로 만들 수 있다.

// 추상프로퍼티
// 추상 클래스는 추상프로퍼티도 가질 수 있다.
// 추상프로퍼티를 만드려면, 추상 멤버 함수처럼 프로퍼티 선언문 맨 앞에 abstract 키워드를 붙이면 된다.

// Person 클래스의 getSalary 멤버 함수는 그저 서브클래스로 전파시키기 위해 선언한 것이므로, 함수 내용을 굳이 필요하지 않다.
// 그래서 추상 멤버 함수로 만들었다.
// 추상 클래스를 상속하는 일반 클래스는 반드시 모든 추상 멤버 함수를 오버라이딩 해야 한다.

// 추상클래스 오버라이딩 미루기
// 추상클래스를 상속하는 서브클래스에도 abstract를 붙이면 추상 멤버 함수를 반드시 오버라이딩 하지 않아도 된다.
// 단, 이 클래스를 다시 일반 클래스로 상속할 때는 오버라이딩을 반드시 해야 한다.

