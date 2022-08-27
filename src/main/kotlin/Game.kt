fun main(){
    val options = arrayOf ("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice (options)
    val userChoice = getUserChoice (options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice (optionsParam: Array<String>) = optionsParam [(Math.random() * optionsParam.size).toInt()]

fun getUserChoice (optionsParam: Array<String>): String{
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice){
        print("Please enter one of the following:")
        for (x in optionsParam) print (" $x")
        println (".")
        var userInput = readLine()
        userInput = userInput?.capitalize() //optional feature
        if (userInput != null && userInput in optionsParam){
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) println ("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult (x: String, y: String){
    val result: String
    if (x == y) result = "Tie!"
    else if ((x == "Rock" && y == "Scissors") || (x == "Paper" && y == "Rock") || (x == "Scissors" && y == "Paper"))
    result = "You win!"
    else result = "You loose!"
    println("You chose $x. Machine chose $y. $result")
}