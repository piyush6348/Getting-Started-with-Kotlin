data class Fruit( var name:String ,var  origin:String ,var weight:Int )

fun main(args: Array<String>) {

    var fruit = Fruit("Mango","Lucknow",1)

    // toString method is overloaded in data class by default in kotlin
    println(fruit)
}