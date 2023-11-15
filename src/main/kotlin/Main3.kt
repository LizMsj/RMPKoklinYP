fun main(){
    try{
        val kol: Int = readLine()!!.toInt()
        println(calcChairs(kol))
    } catch(e: Exception) {
        println("Не получено число инопришленцев")
    }
}

fun calcChairs(x: Int): Int{
    val z: Int = x / 2
    return (z + x)
}