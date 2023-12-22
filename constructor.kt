class Car(var brand: String, var model: String, var year: Int)
{

init{
    print("The car is $brand $model $year")
}
}
fun main() {
  val c1 = Car("Ford", "Mustang", 1969)
}