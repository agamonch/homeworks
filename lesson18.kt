import java.util.*

fun main() {
    val cat = Cat("Tom", "Bengal", 3, 5, 6)
    val food = Food("Besh barmak", "meat and dough", 200)
    val paper = Paper("white", "A4", 100)
    val boiler = Boiler("80l", "Ariston", 20000)
    val battery = Battery("Varta", "1.5v", "cylinder")
    val liquid = Liquid("Water", "H2O", "Suu")
    val cup = Cup("Glass", "200g", 6)
    val box = Box("parallelepiped", "paper", "50l")
    val student = Student("Asan", 21, "hungry")
    val companymember = CompanyMember("Elon", "spasex", "leader", "genius" )
    val book = Book("Philosophy of JAVA", "Eckel Bruce", 2019)
    val book2 = book.copy(name = "Programming Kotlin", year = 2020)
    val book3 = book2.copy(name = "Effective java", year = 2001)
    println(cat.toString() + " " +"Hash code = ${cat.hashCode()}")
    println(food.toString() + " " +"Hash code = ${food.hashCode()}")
    println(paper.toString() + " " +"Hash code = ${paper.hashCode()}")
    println(boiler.toString() + " " +"Hash code = ${boiler.hashCode()}")
    println(battery.toString() + " " +"Hash code = ${battery.hashCode()}")
    println(liquid.toString() + " " +"Hash code = ${liquid.hashCode()}")
    println(cup.toString() + " " +"Hash code = ${cup.hashCode()}")
    println(box.toString() + " " +"Hash code = ${box.hashCode()}")
    println(student.toString() + " " +"Hash code = ${student.hashCode()}")
    println(companymember.toString() + " " +"Hash code = ${companymember.hashCode()}")
    println(cat.equals(food))
    println(book)
    println(book2)
    println(book3)



}

data class  Book(
    val name:String,
    val author: String,
    val year: Int
)
data class Cat(
    val name: String,
    val breed: String,
    val age: Int,
    var satietyLevel: Int,
    var waterLevel: Int)




data class Food(
    val name: String,
    val ingred: String,
    val price: Int)

data class Paper (
    val color: String,
    val format: String,
    val unit: Int
)
data class Boiler(
    val capacity: String,
    val model: String,
    val price: Int,
)
data class Battery(
    val name: String,
    val capac: String,
    val form: String,
)
data class Liquid (
    val name: String,
    val formula: String,
    val kyrgyz: String,
)
data class Cup(
    val material: String,
    val capacity: String,
    val unit: Int
)
data class Box (
    val form: String,
    val material: String,
    val capacity: String,

)
data class Student(
    val name: String,
    val age: Int,
    val status: String,
)
data class CompanyMember (
    val name : String,
    val company: String,
    val position : String,
    val status : String,
)
