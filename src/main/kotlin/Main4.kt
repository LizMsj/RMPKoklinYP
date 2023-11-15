fun main(){
    try{
        val dayNumber = readln()!!.toInt()
        val bugRank = readln()!!.toInt()
        val cashAmount = readln()!!.toInt()
        println(sahar(dayNumber, bugRank, cashAmount))
    } catch (e: NumberFormatException) {
        println("числами, пж")
    }
}

fun sahar(x: Int, y: Int, z: Int): Int{
    return z * (x * (y + 42))
}