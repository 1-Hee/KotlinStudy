package `84_ex_access_modifier_protected`

//chap 84. 접근지정자 : protected

open class AAA(protected val number:Int) // number 프로퍼티에 protected를 지정함.

class BBB(number:Int):AAA(number)  // AAA 클래스를 상속하는 BBB 클래스 선언
{
    fun printNumber()
    {
        //AAA 클래스의 number 프로퍼티에 접근 가능
        println(number) // number 프로퍼티는 protected로 지정되어있음, 따라서 서브클래스 BBB에서 접근 가능
    }
}

fun main(args:Array<String>)
{
    val test = BBB(36)
    // println(test.number)
    // 에러 ; number 프로퍼티는 protected로 지정되어 있기 때문에 AAA,BBB 클래스 외부에서 접근이 불가능. protected는 서브클래스에서 접근가능한점을 빼면 private와 동일
    test.printNumber() // 멤버함수 printNumber()는 public이므로 호출 가능.
}