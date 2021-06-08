package `82_ex_access_modifier`

//chap 82. 접근 지정자
// 코틀린에서 선언 가능한 요소(함수, 전역변수, 클래스, 프로퍼티, 멤버함수 등 ) 중 일부 요소에는 접근권한을 지정할수 있다.
// 이를 접근 지정자 또는 가시성 지정자라고 한다. 접근지정자는 총 4개가 있다
// 1) public : 모든곳에서 접근 가능, 접근 지정자를 생략하면 기본적으로 public
// 2) internal : 같은 모듈 안에서 접근 가능, 여기서 모듈은 IntelliJ 프로젝트의 모듈을 가리킨다.
// 3) protected : 클래스 내부와 서브클래스 안에서만 가능하다
// 4) private : 프로퍼티와 멤버 함수일 경우, 해당 클래스 안에서만 접근 간으하고, 그외의 경우, 같은 파일 내에서만 접근 가능하다.

class Rectangle(private val width:Int,
                private val height:Int){
    val area:Int
    get()=width*height
}

fun main(args:Array<String>){
    val rect =Rectangle(5, 7)
//    println(rect.width) // 에러
    // 윗 코드의 주석을 제거하면 Cannot access 오류가 발생함.
    println(rect.area)
    // Rectangle 클래스의 width, height 프로퍼티를 private로 선언하였으므로,
// width와 height 프로퍼티는 오직 Rectangle 클래스 내부에서만 접근 가능하다.
    // rect 객체의 width 프로퍼티에접근하면 width는 pirvate이기 때문에 주석을 해제하면 오류가 발생한다.

}