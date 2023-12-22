fun countdigit(num:Int):Int  //Here num is immutable type
{
    var count=0
    var n=num
    while(n>0)
    {
        count=count+1
        n=n/10

    }
    return count
}


fun main()
{
    print("Entyer the number ")
    var nunber=readln().toInt()
    var count=countdigit(nunber)
    println("THe Number of digit in $nunber is $count")

}