fun main() {
    var a = 5
    val b = 3

    a += b // equivalent to a = a + b
    println("a after += operation: $a")

    // Using plusAssign method
    a = 5
    a.plusAssign(b) // equivalent to a = a + b
    println("a after plusAssign operation: $a")
}
