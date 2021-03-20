import java.util.*

fun main() {
    val cat = Cat("Tom", "Bengal", 3, 5, 6)
    println("Cat's name is ${cat.name}, age ${cat.age}, satiety level = ${cat.satietyLevel}, water level = ${cat.waterLevel} ")

}

class Cat(name: String, breed: String, age: Int, satietyLevel: Int, waterLevel: Int){
    val name = "Tom"
    val breed = "Bengal"
    val age = 3
    var satietyLevel = 2
    var waterLevel = 3
    init {
        this.satietyLevel = satietyLevel
        this.waterLevel = waterLevel
    }

}
class Food {
    val name = "Besh barmak"
    val ingred = "meat and dough"
    val price = 200

}
class Paper {
    val color = "white"
    val format = "A4"
    val unit = 100
}
class Boiler{
    val capacity = "80l"
    val model = "Ariston"
    val price = 20000
}
class Battery{
    val name = "varta"
    val capac = "1.5 v"
    val form = "cylinder"
}
class Liquid {
    val name = "water"
    val formula = "H2O"
    val kyrgyz = "Suu"
}
class Cup{
    val material = "glass"
    val capacity = "200 g"
    val unit = 6
}
class Box {
    val form = "parallelepiped"
    val material = "paper"
    val capacity = "50 l"

}
class Student{
    val name = "Asan"
    val age = 21
    val status = "Hungry"
}
class CompanyMember {
    val name = "Elon"
    val company = "spasex"
    val position = "Leader"
    val status = "Genius"
}
