package ex_member_function

fun main(args:Array<String>) {

    val building = Building()
    building.name = "A오피스텔"
    building.date = "2017-12-13"
    building.area = 120 * 8

    building.print()

    // Building이라는 클래스에 있는 형식을 사용
    // 클래스의 변수를 설젇할 때는 메인 함수의 변수.클래스변수 형식으로 사용하면 된다.
    // 또한, 본 경우에는 함수가 내장되어 있는데 이것도 클래스변수처럼 메인함수변수.함수명 이런식으로 사용 가능한듯 하다.

}