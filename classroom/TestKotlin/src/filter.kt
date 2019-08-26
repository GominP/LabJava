import kotlin.random.Random
fun isOneDigit(number: Int) = if (number in 0..9)true else false

fun main() {
    val listofNumber = listOf<Int>().toMutableList()

    for (round in 1..20){
        listofNumber.add(Random.nextInt(-100,101))
    }
    println(listofNumber)
//    for (data in listofNumber){
//        if (data >= 0 ) println("$data")
//    }
    println(listofNumber.filter { it >=  0 })
    println(listofNumber.filter { isOneDigit(it) })
}