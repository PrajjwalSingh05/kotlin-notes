fun main()
{
    println("Enter the number")
    var num=readln().toInt()
    var newnum=0
    var count=0
    var cubedigit=0
    while(num>0)
    {
        var rem=num %10
        count=count+1
        num=num/10
        newnum=newnum*10+rem
        cubedigit=cubedigit+rem*rem*rem

    }
    println("The total numbe rof dfigit in $num is $count")
    println("The Reverse of $num is $newnum")
    println("The cube of $num is $cubedigit")

}