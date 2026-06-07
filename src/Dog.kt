class Dog(_name:String="The dog"):Animal(_name) {
    override fun makeASound(){
        bark()
    }

    private fun bark() {
        println("$animalName said woof!")
    }
}