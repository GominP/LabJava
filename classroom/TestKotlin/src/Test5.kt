import java.util.*

fun main() {
    print("Hello")
    println("Thursday. Tee")
    println("Kuy fit")
    System.out.printf("Hello %s","Tee")
    println("Hello %s".format("Teh"))

    var input = readLine() //return String
    val sc = Scanner(System.`in`)
    println(sc.nextInt()+10)
    if (input is String){
        println("Yes")
    }

}