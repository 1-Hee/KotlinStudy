package ex_indexed_access_operator

// chap 60. 번호 붙은 접근 연산자

class Person(var name:String, var birthday:String){

    operator fun get(position: Int):String
    {
        return when (position){
            0 -> name
            1 -> birthday
            else -> "알 수 없음"
        }
    }

    operator fun set(position: Int, value: String) {
        when (position)
        {
            0 -> name = value
            1 -> birthday = value
        }
    }

}