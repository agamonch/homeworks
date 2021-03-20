import kotlin.math.pow

fun main() {

    compInter()

}
fun compInter(){
    println("Vvedite summu depozita :")

    val dep = readLine()!!.toFloat()
    println("Vvedite % stavku :")
    val inter = readLine()!!.toFloat()
    val s = dep * (1 + (inter/100)).pow(3)
    println("Total sum in 3 years = $s")

}