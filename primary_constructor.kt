class Demo (var x: Int, var y: Int=90) {
    init {
        println("This is init block x: $x , y:$y")
    }
}
fun main()
{
    // var d1=Demo()
    var d2=Demo(10,20)
    var d3=Demo(10)
    // var d4=Demo(y=10)
    var d5=Demo(x=10)
    var d6=Demo(y=10,x=20)
}