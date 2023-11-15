fun main(){
    println(readln().toInt().getYearEra())
}

fun Int.getYearEra() : String
{
    return when {
        this < 1970 -> return "до"
        this == 1970 -> return "соответствует"
        this in 1970..2000 -> return "после (XX век)"
        this in 2000..2023 -> return "после (XXI век)"
        else -> return "далекое будущее"
    }
}