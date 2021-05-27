package ex_property_getter_setter

fun main(args:Array<String>){
    val person = Person()
    person.age = -30
    println(person.age)

    person.age = 40
    println(person.age)

}