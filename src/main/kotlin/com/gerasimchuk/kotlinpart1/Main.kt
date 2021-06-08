package com.gerasimchuk.kotlinpart1

fun main(args: Array<String>) {
    println("Hello from Kotlin")

    // can omit type declaration
    // val q: Question = Question()
    val q = Question()
    q.answer = "42"
    // we can change 'answer' because it is 'var', not 'val'
    q.answer = "43"

    q.display()

    // for complex templates we should usecurly braces
    println("q.answer is ${q.answer}")

    // classic 'if' operator
    if (q.answer == q.correctAnswer){
        println("Correct!")
    }
    else {
        println("Not correct!")
    }

    // kotlin way: we can assign 'if' evaluation result to a variable (or value)
    val message = if (q.answer == q.correctAnswer){
        "Correct in a kotlin way!"
    }
    else {
        "Not correct (in a kotlin way)"
    }

    println("Kotlin way : $message")

    //////////// null safety /////////////
    //null-safe
    val qq = Question()

//    compile error
//    qq = null

    // use '?' after type to declare a nullable type
    var qNullUnsafe: Question? = Question()

    // no error here: be
    qNullUnsafe = null

    //////////// when /////////////
    printResult(q.answer)


}

// we can declare several classes in one file
class Question {
    // setters and gtters grated automatically
    var answer: String = ""
    val correctAnswer: String = "42"
    val question: String = "What is the answer to life, the universe and everything?"

    fun display(){
        // we can use template string instead of concatenation
//        println("The answer is " + answer)
        println("Your answer is $answer")

    }
}

fun printResult(answer: String){

    val correctAnswer = "42"

    when(answer){
        correctAnswer -> print("Correct!")
        "44" -> print("Especially not")
        else -> print("Try again!")
    }
}


