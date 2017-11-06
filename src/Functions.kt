fun area(side:Int): //Return Type
     Int{
    return side * side
}

fun area(side: Int , height:Int = side): Int{

    // First area func is useless as this func covers for both
    return side * height
}

// By default return type of all func is Unit unless not specified

fun sayHello(){
    println("Hello")
}

fun sayHello2():Unit {
    println("Hello")

    // throws error
    // return "k"
}

fun main(args: Array<String>) {

    sayHello()

    println( "Area of square of side 4 is " + area(4))

    println( "Area of rectangle of side 4 is " + area(4,4))

    println( "Area of rectangle of side 4 is " + area(4,10))
}