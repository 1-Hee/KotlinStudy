package ex_init_blocks

// chap 55. Init 블록 나누어 쓰기

class Size(width:Int, height: Int) {
    val width = width
    val height : Int

    init {
        this.height = height
    }

    val area : Int

    init {
        area = width * height
    }

    // Init은 분리하여 각각 코딩 가능하다.

}

fun main(args:Array<String>) {
    val size = Size(10, 50)
    println(size.area)
}