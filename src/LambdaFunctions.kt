
fun sayHello(fn: ()->String):String{
    return "Hello" + fn()
}

fun createGreeting(fn: (String) -> String, name:String):String{
    return "Hello "+ fn(name)
}

fun main(args: Array<String>) {

    println( createGreeting({ inp -> "$inp + Gupta"},"Piyush"))
}