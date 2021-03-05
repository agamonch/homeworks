fun main(){
    val a = 13
    var message = ""
//    if(a%2==0) {
//        message = "a is even"
//    }
//    else if(a%5==0){
//        message = "a is divisible by 5"
//    }
//    else{
//        message = "a is not even and not divisible by 5"
//    }
//    println(message)
    when {
        a%2==0 -> message = "a is even"
        a%5==0 -> message = "a is divisible by 5"
        else -> message = "a is not even and not divisible by 5"

    }
    println(message)
}
