package ex_member_function

// chap 52. 멤버 함수 (Member Function)
// 어떤 특정 변수에 대한 기능을 하는 두 함수가 다루는 변수가 같고,
// 특정 변수가 있는 클래스와 강한 연관을 가질 때, 오직 그 클래스만을 위한 함수이면,
// 클래스의 안으로 내장시킬 수 있다.


class Building {
    var name = "" // 건물명
    var date = "" // 건축일자
    var area = 0 // 면적

    fun print()
    {
        println("이름 :" + this.name)
        println("건축일자 :" + this.date)
        println("면적 :" + this.area )
    }



}