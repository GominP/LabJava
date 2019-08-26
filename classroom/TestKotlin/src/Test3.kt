fun main() {
    var normalStr = "Computer \n Kasetsart \n Bangkhen"
    var rawString = """
        ComTee
        Harajuku
        Boy
        """".trimIndent()

    var rawString2 = """
        >>>ComTee
        >>>Harajuku
        >>>Boy
        """.trimMargin(">>>")

    println(rawString2)



}
