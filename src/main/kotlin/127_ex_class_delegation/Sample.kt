package `127_ex_class_delegation`

class Sample :Plusable by ClassDelegator()
// 인터페이스를 구현하면서 뒤에 by 객체를 지정하면 인터페이스의 구현을 해당 객체로 위임한다.
// 이때 객체는 대리할 인터페이스를 구현하고 있어야 한다.
// 앞으로 Sample의 Plus 연산자 멤버 함수를 호출하면 ClassDelegator의 plus가 호출된다.

