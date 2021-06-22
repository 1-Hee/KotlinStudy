package `116_ex_in_out_kotlin`

// Chap 116. in/out 키워드
// 다음과 같은 코드가 가능할지 생각해보자
// class AAA<T>
//...
// val a = AAA<Int>()
// val b: AAA<Any> = a

// a는 AAA<Int> 타입이고, b는 AAA<Any>타입이다. Int는 Any 타입을 상속하니 업캐스팅을 이용하여 AAA<Any> 타입에 AAA<Int>타입의 값을 넣을 수 있지 않을까?
// 답은 '아니오' 이다. Int 타입이 Any의 서브 타입이라고 해서 AAA<Int>가 AAA<Any>의 서브 타입인 것은 아니기 때문이다.
// 이번 예제에서는 AAA<Int> 타입의 값을 AAA<Any> 타입으로 받을 수 있게 하는 방법을 알아볼 것이다.

class AAA<out T>

class BBB<in T>

fun main(args:Array<String>)
{
    val aaaSub = AAA<Int>()
    val aaaSuper:AAA<Any> = aaaSub

    val bbbSuper = BBB<Any>()
    val bbbSub:BBB<Int> = bbbSuper

    val star:AAA<*> = aaaSub
}

// AAA 클래스의 타입 매개변수 앞에 out 키워드를 붙였다.
// 이렇게 하면 AAA<서브 타입>을 AAA<슈퍼 타입>에 대입할 수 있게 된다.

// 자바의 out 키워드
// out T는 자바의 ? extends T와 같다.
// BBB 클래스의 타입 매개변수 앞에 in 키워드를 붙였다.
// 이렇게 하면 BBB<슈퍼 타입>을 BBB<서브 타입>에 대입할 수 있다.

// 자바의 in 키워드
// in T는 자바의 ? super T와 같다.

// 타입 인수로 *를 지정하면, 타입 인수가 무엇이든 상관 없이 AAA 타입을 대입할 수 있다.
// 즉, AAA<Any>든, AAA<Int>든, AAA<String>이든 상관없이 star 변수에 대입 가능하다.