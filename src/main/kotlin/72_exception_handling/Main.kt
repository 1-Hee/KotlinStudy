package `72_exception_handling`

import java.lang.NumberFormatException


// chap 72. 예외를 처리하는 법
// 코틀린에서는 예외 발생 시 이를 처리할 수 있는 기회를 제공한다.
// 예외를 처리하면 프로그램이 강제 종료되는 것을 막을수 있다.


fun main(args:Array<String>)
{
    try {
        val str = "abcd"
        val num = str.toInt()
        println(num)
    }
    catch (e:NumberFormatException)
    {
        println("문자열을 숫자로 변경하지 못함")
    }
    finally {
        println("프로그램 종료")
    }
}

// 예외가 발생할 가능성이 있는 부분을 try 블록으로 감싸고 있다.
// try 블록 바로 아래에, 예외가 발생했을 때, 대신 실행할 코드를 catch 블록으로 지정한다.
// catch의 소괄호 안에는 어떤 예외가 발생했을 때 이 catch 블록을 실행할지를 지정한다.
// e는 예외 객첼르 가리키는 참조변수, NumberFormatException의 에외 타입이다.
// 잘못된 문자열을 숫자로 변환할 때 NumberFormatException 타입의 에외가 발생하므로 catch에 NumberFormatException 타입의 참조변수를 적어놓았다.
// 15번 줄 에서 str.toInt()를 호출중에 NumberFormatException 예외가 발생하믈 ㅗ코드는 8번줄가지만 실행되고 바로 20번줄로 점프하고 출력된다.
// finally부분은 예외 발생 여부와 상관 없이 무조건 실행되는 블록이다.
// 즉 try 블록 안의 코드를 무사이 마쳐도 예외가 발생해 catch 블록으로 빠져도 finally 블록은 항상 실행된다.
// finally 블록은 생략이 가능하다. "프로그램종료"가 출력된다.

// ++ 여러종류의 예외를 처리하려면 catch 블록을 여러개 두면 된다.