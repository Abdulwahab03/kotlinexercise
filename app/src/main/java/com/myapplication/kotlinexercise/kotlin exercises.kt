package com.myapplication.kotlinexercise

fun getGameChoice(optionsParam: Array<String>) =
     optionsParam[(Math.random()* optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>):String{
    var isValidChoice = false
    var userChoice = ""
    // We loop until the user enter a valid choice
    while(!isValidChoice){
        print(" Please  enter one of th following: ")
        for (items in optionsParam)  print(" $items ")
        println(" . ")
        // Read the user input
        val userInput = readLine()
        //Validate the user input
        if(userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput

        }
        if(!isValidChoice) println("you must enter a valid input.")

    }
    return userChoice
}

fun main(){
    val options = arrayOf("Paper", "Scissors" , "Rock")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(gameChoice, userChoice)

}

fun printResult(gameChoice: String, userChoice: String) {
    val result:String = if(gameChoice == userChoice) "Tie"
    else
        if((userChoice == "Scissors" && gameChoice == "Paper") ||
            (userChoice == "Rock" && gameChoice =="Scissors" ) ||
            (userChoice == "Paper" && gameChoice == "Rock")) " You wim!"
        else "You lose!"
    print(" You chose $userChoice. I chose $gameChoice. $result ")


}
