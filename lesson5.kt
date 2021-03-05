fun main(){
    println("Enter a four-digit number:")
    var number = readLine()!!.toString()
    if((number[0].toInt()+number[1].toInt())==(number[2].toInt()+number[3].toInt())){
        println("True")
    }
    else{
        println("False")
    }

}