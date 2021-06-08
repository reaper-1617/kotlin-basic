package com.gerasimchuk.kotlinpart0

fun main(args: Array<String>){
    println("This is a very basic examples of what Kotlin can do")

    // no 'new' key
    // 'var' means variable => can be reassigned
    // 'val' means value => cannot be reassigned
    val person = Person("Kevin")

//    person.name = "Kevin"

    println("Name is ${person.name}")

    // because 'name' is var in class => we can reassign it
    person.name = "Steve"

    println("Name is ${person.name}")

    person.display()

    person.display(::printName)

}

fun printName(s: String){
    println(s)
}