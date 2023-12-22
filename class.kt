
class Car(
    var name: String,
    var model: String,
    var color: String
) {


    fun getInformations() {
        println("name : $name , model $model , color $color")
    }
}


fun main()
{
    var car=Car("BMW","2020","Black")
    car.getInformations()
    car.name="Audi"
    car.getInformations()
}