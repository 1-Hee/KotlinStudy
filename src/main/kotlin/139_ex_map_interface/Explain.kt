package `139_ex_map_interface`

//chap 139. map 인터페이스 살펴보기
// Map 인터페이스는 다음과 같이 선언되어 있다.
// interface Map<K, out V>

// Map 인터페이스는 아래와 같은 멤버를 갖는다.

// interface Entry<out K, out V>
// Entry 는 키와 값 한 쌍을 표현하는 중첩 인터페이스이다.

// abstract val size:Int
// size는 Map에 들어있는 키와 값 쌍의 개수를 갖는 프로퍼티이다.

// abstract val keys: Set<K>
// keys는 Map의 키들만 갖는 프로퍼티이다. Map의 키는 중복되지 않기 때문에 Set 타입으로 되어 있다.

// abstract val values: Collection<V>
// values는 Map의 값들만 갖는 프로퍼티이다.
// Map의 값은 중복될 수 있기 때문에 Collection 타입으로 되어 있다.

// abstract val entries: Set<Map.Entry<K, V>>
// entries는 Map에 들어있는 모든 키와 값 쌍들을 갖는 프로퍼티이다.
// 키와 값은 Entry 타입으로 감싸여 있다.

// abstract fun isEmpty():Boolean
// isEmpty 멤버 함수는 Map이 비어있는지 여부를 반환한다.

// abstract fun containsValue(value: V): Boolean
// containsValue 멤버함수는 Map에 value에 해당하는 값이 들어있는지 여부를 반환한다.

// abstract operator fun get(key:K):V?
// get은 key에 해당하는 값을 반환하는 연산자 멤버 함수이다.
// 만약 key에 해당하는 값이 없으면 null이 반환된다. 그래서 반환타입이 V? 이다.
// get은 Map 타입에 [] 연산자를 사용할 수 있도록 하는 역할도 한다.

// open fun getOrDefault(key:K, defaultValue: V): V
// getOrDefault 멤버 함수는 key에 해당하는 값을 반환하되, key에 해당하는 값이 없으면 defaultValue를 대신 반환한다.


