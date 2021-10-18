fun main(args: Array<String>) {

var sportCar =SportCar()
    sportCar.SetType("Sport Car")
sportCar.StartEngine = true
    sportCar.ChangeGear(2)
    sportCar.speedUp()
    sportCar.ChangeGear(4)
    sportCar.speedUp()
    sportCar.PrintStates()



    var truck=Truck()
    truck.SetType("Truck")
    truck.StartEngine=true
    truck.ChangeGear(1)
    truck.speedUp()
    truck.ChangeGear(2)
    truck.speedUp()
    truck.PrintStates()

    sportCar.applyBrakes()
    truck.applyBrakes()



}