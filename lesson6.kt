import java.lang.Math.sqrt

fun main(){
    println("Enter the month number:")
    var month = readLine()!!.toInt()
    when (month) {
        1, 3, 5, 7, 8, 10, 12 -> println("month # $month - 31 days")
        2 -> println("month # $month - 28 days")
        4, 6, 9, 11 -> println("month # $month - 30 days")
        else -> println("Invalid input")
    }

//    Доп задание
    println("Enter value x:")
    var x = readLine()?.toFloat()
    println("Enter value y:")
    var y = readLine()?.toFloat()
    println("Enter the radius of the circle:")
    var r = readLine()?.toFloat()
    var h = kotlin.math.sqrt(x!! * x + y!! * y)
    when {
        h<= r!! -> println("The point is in the circle")
        else -> println("The point is outside the circle")
    }
}


