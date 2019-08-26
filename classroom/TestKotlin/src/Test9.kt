fun main() {
    var arrInt = arrayListOf(1,5,7,9)
    var arrIntx2 = arrInt.onEach { println(it*2) }
    var arrIntx3 = arrInt.forEach{ println(it*2) } //foreach return void

    println(arrInt)
    println(arrIntx2)
}