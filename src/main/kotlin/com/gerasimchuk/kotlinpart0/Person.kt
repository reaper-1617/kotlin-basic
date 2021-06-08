package com.gerasimchuk.kotlinpart0

class Person (var name: String){
//    var name:String = ""


    // no 'public' because its by default
    fun display(){
        println("Display: $name")
    }

    // 'Unit' is a kind of Void in Kotlin
    fun display(func: (s: String) -> Unit){
        func(name)
    }

}