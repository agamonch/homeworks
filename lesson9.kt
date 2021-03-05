fun main() {
    for(i in 0..4 ){
        for(j in 0..5){
            print("* ")
        }
        println(" ")
    }
    val n = 5
    for(i in 0..n) {
        for(j in 0 until n-i){
            print("  ")
        }
        for (j in i+1  downTo  1){
            print("* ")
        }
        println()
    }
//    Доп задание 1
    println("Enter number:")
    var number = readLine()!!.toInt()
    var res = number
    var count: Int
    if (number == 0)
        count = 1
    else count = 0
    while (number != 0){
        count++
        number /= 10
    }
    println("Number $res has $count digit(s)")

//    Доп задание2
    var a = 1
    var b = 2
    while(a <= 20){
        print("$b  ")
        a++
        b *= 2
    }

}