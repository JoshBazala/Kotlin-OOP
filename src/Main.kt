//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val dog0:Animal = Dog("Hachiko")
    val cat0:Animal = Cat("Tom")
    moveAndMakeASound(dog0)
    moveAndMakeASound(cat0)

    //NEW CODE
    val mouse0:Mouse = Mouse("Jerry")
    moveAndMakeASound(mouse0)

    println("${mouse0.animalName} has ${mouse0.getCheeseAmount()} cheese.")
    mouse0.StealCheese(5)
    println("${mouse0.animalName} stole cheese and now has ${mouse0.getCheeseAmount()} cheese.")
    mouse0.EatCheese()
    println("${mouse0.animalName} has eaten cheese and now has ${mouse0.getCheeseAmount()} cheese.")
}

fun moveAndMakeASound(animal:Animal){
    animal.move("forward")
    animal.makeASound()
}