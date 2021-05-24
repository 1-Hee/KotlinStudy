package ex_role_of_heap

// chap 48. 힙 영역의 존재 이유
// 객체는 왜 스택이 아닌 힙에 저장되는가?
// 객체가 스택에 저장되면, 함수 호출이 끝난 후에 스택에서 지워진다.
// 하지만 힙에 저장된 객체의 정보는 함수 호출이 끝나도 지워지지 않으므로, 다음과 같이 코드를 작성해도
// 기존의 데이터로 계속 연산이나 처리를 할 수 있는 것이다.
// 이러한 이유로 객체는 스택이 아닌 힙 영역에 저장된다.

// 그렇다면 힙의 수명은?
// 힙 영역에서 샛엉한 변수는 어느 블록에서 생성했던 간에 블록을 빠져나와도 지워지지 않는다.

fun main(arg:Array<String>) {

    val product : Product ; product = createProduct()
    printProductInfo(product)
    processProduct(product)
    printProductInfo(product)

}

fun processProduct(product: Product) {

    product.price += 500

}

fun printProductInfo(product: Product) {
    println("이름:${product.name}")
    println("가격:${product.price}")

}

fun createProduct(): Product {

    val apple = Product()
    apple.name = "Apple"
    apple.price = 1000

    return apple

}


