class SportCar():Vehicle() {

    // Checks the engine if it started it will change the gear number to a number between 1 and 5 otherwise sets to zero.
    override fun ChangeGear(value: Int) {

        if (isMoving() && gear>=1 && gear<=5){
            gear=gear
        }else
            gear=0
    }

    //Increments speed value by 20.
    override fun speedUp() {

        speed=speed+20
    }


}