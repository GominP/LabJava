import java.util.*

fun main() {
    var name = "TeeHarajuKU"

    var nameChartArray = name.toCharArray()

//    for (char in nameChartArray){
//        println(char)
//    }

//    nameChartArray.forEach { println(it) }

    var arrInt = arrayOf(1,2,3,4,5,6)
    var arrayListInt = arrayListOf<Int>(1,3,5,7,9)
    var listInt = listOf<Int>(2,4,6,8)

    var nullArray = arrayOfNulls<Int>(10)


    println(Arrays.toString(arrInt))
    println(arrInt.toList())
    println(arrayListInt)
    println(listInt)
    println(Arrays.toString(nullArray))



}