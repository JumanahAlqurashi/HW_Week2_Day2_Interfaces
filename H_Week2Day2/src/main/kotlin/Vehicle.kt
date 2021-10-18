open class Vehicle():IVehicle {


    override var type: String=""
    override var gear:Int=0
    override var speed:Int=0
    override var StartEngine:Boolean = false


    // Check if speed more than zero then returns true otherwise false.
    override fun isMoving():Boolean{

        if (speed>0)
            return true
        else
            return false

    }

    //Increments speed value
    open fun speedUp(){

       speed++
    }

    // Changes gear's numbers
    open fun ChangeGear(value:Int){


        var gear=value
    }


    //Sets the speed to zero
    fun applyBrakes(){

        speed=0
        gear=0

    }

    //Sets the type of the vehicle.
    fun SetType(type1:String){


        this.type=type1

    }

    //Print the state of the vehicle either is moving or not
    fun PrintStates(){

        if(speed>0){
            println("$type \n present state : Moving \nSpeed: $speed Gear: $gear")
        }else if(speed==0){
            println("$type \n present state : Stopped \nSpeed: $speed Gear: $gear")
        }
    }


}