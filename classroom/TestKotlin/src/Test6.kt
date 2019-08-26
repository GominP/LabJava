import java.util.*

fun getMax(a : Int, b: Int) = if (a>b) a else b
fun getGrade(score: Int) =when(score){in 0..49 -> "Grade F"
    in 50..59 -> "Grade D"
    in 60..69 -> "Grade C"
    in 70..79 -> "Grade B"
    in 80..100 -> "Grade A"
    else -> ""}

fun main() {
    val sc = Scanner(System.`in`)
    var score = sc.nextInt()
//    var grade : Int
    if (score in 1..100){
        println("Valid")

//        var grade = when(score){
//            in 0..49 -> "Grade F"
//            in 50..59 -> "Grade D"
//            in 60..69 -> "Grade C"
//            in 70..79 -> "Grade B"
//            in 80..100 -> "Grade A"
//            else -> ""

        }
//            if (score in 0 until 50) //0-49
//        {
//            ("Grade F")
//        }
//        else if (score in 50..59)//50-59
//        {
//            println("Oraaaaaaa")
//            ("Grade D")
//        }
//        else if (score in 60..69)//50-59
//        {
//            ("Grade C")
//        }
//        else if (score in 70..79)//50-59
//        {
//            ("Grade B")
//        }
//        else if (score in 80..109)//50-59
//        {
//            ("Grade A")
//        }
//        else{""}
//
//        println(grade)
//    }
//    else{
//        println("Invalid")
//    }

//    var isPassed = {score>= 50 ? true : false}
//    var isPassed = if (score >=50) true else false
    println(getGrade(40))

//    println(getMax(30,50))
    }
