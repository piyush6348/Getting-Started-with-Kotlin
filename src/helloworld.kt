fun main(args: Array<String>) {

    val x = "Piyush"
    // not allowed as value
    // x = "21"

    var xVar = "Piyush"
    xVar = "27"

    val fName:String = "Piyush"

    // uncomment this it will give compile time error
    //fName = null

    println("Hey $fName")


    val fName_NULL_ALLOWED:String?

    fName_NULL_ALLOWED = null

    println("$fName_NULL_ALLOWED")
}