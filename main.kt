  fun main() {
        println("ax2+bx+c=0")
        println("Enter a, b, c: ")
        var a = readLine()!!.toFloat()
        var b = readLine()!!.toFloat()
        var c = readLine()!!.toFloat()
        var d = (b*b)-(4*a*c)
        if (d<0) {
              println("no root")
        }
        else if (d==0f) {
              var x = (-b + kotlin.math.sqrt(d)) / (2 * a)
              println("root x = $x")
        }
        else {
              var x1 = (-b + kotlin.math.sqrt(d)) / (2 * a)
              var x2 = (-b - kotlin.math.sqrt(d)) / (2 * a)
              println("roots: x1 = $x1, x2 = $x2")
        }


//        Доп задание1
        println("Enter departure time hh:mm")
        var d_time = readLine()!!.split(":")
        println("Enter arrival time hh:mm")
        var a_time = readLine()!!.split(":")
        var t_time = ((a_time[0].toInt() * 60) + a_time[1].toInt())-((d_time[0].toInt() * 60)+ d_time[1].toInt())

        println("Travel time = $t_time minutes")


//      Доп задание 2
      println("Enter first number")
      var number1 = readLine()!!.toInt()
      println("Enter second number")
      var number2 = readLine()!!.toInt()
      number1 = number1+number2
      number2 = number1-number2
      number1 = number1-number2
      println("Now first number = $number1 and second number = $number2")

  }
