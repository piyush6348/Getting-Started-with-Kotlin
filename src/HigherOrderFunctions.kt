fun func():Int{
    var x=10

    fun myInnerFunc(){

        // variables of outer function are accessible to inner functions
        x+=1
    }
    myInnerFunc()
    return x
}

fun func2():()->String{
    fun myInnerFunc():String{
        return "Piyush Gupta"
    }

    // functions having no input parameter can be called just by there name
    // without any brackets hence while returning a function as it is
    // we need to tell kotlin to return function itself
    // rather than calling it and returning the answer
    return ::myInnerFunc
}

fun createGreeter(salutation:String):(name:String)->String{
    fun answer(name: String):String{
        return "$salutation  $name"
    }
    return ::answer
}
fun main(args: Array<String>) {
    println(func())
    println()

    // For running the obtained function below is the syntax
    println(func2()())
    println(createGreeter("Hello")("Piyush Gupta"))
}