import java.awt.Color
import kotlin.concurrent.timer

fun main() {
var car=Car ("toyota","Camry","white",20)
    car.carry(30)
   println( car.calculateParkingFees(3))
    car.identity()

 var bus=Bus("subaru","larry","blue",50)
    println( bus.calculateParkingFees(11))
    println(bus.calculateParkingFees(11,50))






}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20 (1 point)

//2. Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus
open class Motor(var make: String,var model: String,var color: String,var capacity: Int ){
    fun carry(people: Int){
        var x = people - capacity
        if (people <= capacity){
            println("carrying $people passengers")
        }
        else{
            println("over capacity by $x people")
        }
    }

    fun identity(){
        println("I am a $color $make $model")
    }
    fun calculateParkingFees(hours: Int):Int{
        val parkingFess=hours *20
        return parkingFess
    }
}
 class Car( make: String,model: String, color: String, capacity: Int ):Motor(make, model, color, capacity){


    }
class Bus(make: String,model: String, color: String, capacity: Int ):Motor(make, model, color, capacity){
    fun maxTripFare(fare: Double):Double{
        val trip =fare.times(capacity)
        return trip

    }
    fun calculateParkingFees(hours: Int,capacity: Int):Int{
        var parkingFees = hours * capacity
        return parkingFees

    }
}



