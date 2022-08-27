fun main(){
    fun myInteger (param: Int){
        println("Parameter is $param")
    }
    myInteger(10)

    val x = 7
    val y = 8
    printSum (x, y)
    println (max (6,7))

    // for loop example
    /*for (i in 1..20){
        println (i)
    }
    for (u in 1..20) println (u)
    */
    //for (j in 1 until 10) println (j)

    // x = x + 1 same as x++
    // x = x - 1 same as x--
    // -=, *=, /=

    // for (b in 15 downTo 1) println (b)

    //for (g in 1..10 step 3) println (g)

    // val userInput = readLine()

    /* if (price >= 200 && price <= 300){

    }

    if (price <= 10 || price >= 1000){

    } */

    // != not equals
    // ! not
    // if (x != 10) println (x is not equals 10)
    // if (x ! 10) println (x could be any number but 10)

}

fun printSum(int1: Int, int2: Int){
    val result = int1 + int2
    println(result)
}

fun max (a: Int, b: Int): Int{
    val maxValue = if (a > b) a else b
    return maxValue
}