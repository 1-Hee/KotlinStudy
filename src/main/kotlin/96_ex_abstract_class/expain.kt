package `96_ex_abstract_class`

// chap 96. 추상 클래스
// 상속을 사용하다 보면 단순히 여러 타입을 하나의 타입으로 묶는 용도로 쓸 때가 많다.
// 가령, 다음과 같은 코드가 있다고 가정해보자

// 학생, 교수, 직원 클래스를 하나의 타입으로 묶어주는 클래스
open class Person
{
    open fun getSalary() = 0
    open fun getSalay(): Int {
        TODO("Not yet implemented")
    }
}

// 학생 클래스, tuition 은 한학기 등록금
class Student(private val tutition:Int):Person()
{
    //학생은 등록금을 납부하므로 salary를 음수 처리
    override fun getSalay() = -tutition
}

// 교수 클래스, classCount는 진행하는 수업의 수
class Professor(private val classCount:Int):Person()
{
    override fun getSalary() = classCount * 120
}

//학교 직원 클래스, initial은 초봉(반기), years는 경력(년)
class Employee(private val initial:Int, private val years:Int):Person()
{
    override fun getSalary() = initial * (1.0 + years / 10.0).toInt()
}

// 여기서 person은 단순히 Student, Professor, Employee 클래스를 Person 타입으로 묶기 위한 클래스이며,
// 각 서브 클래스에 getSalary라는 멤버 함수를 전파시키고 있다.
// Person 처럼 여러 클래스를 한 타입으로 묶어주고, 공통되는 멤버를 전파하는 용도로 쓰는 클래스는 추상 클래스로 선언하는 것이 좋다.