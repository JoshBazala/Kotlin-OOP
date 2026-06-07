class Mouse(_name:String="The mouse"):Animal(_name) {

    private var CheeseAmount:Int = 0

    override fun makeASound(){
        squeak()
    }

    private fun squeak() {
        println("$animalName squeaked!")
    }

    fun getCheeseAmount(): Int {
        return CheeseAmount
    }

    fun StealCheese(x:Int) {
        CheeseAmount += x
    }

    fun EatCheese() {
        CheeseAmount--
    }
}