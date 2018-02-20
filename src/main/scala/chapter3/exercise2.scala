package chapter3

object exercise2 extends App {
  println("Chapter 3, Exercise 2")

  var implA = (amount: Double) => {
    if (amount > 0) {
      "greater"
    } else if (amount < 0) {
      "less"
    } else {
      "same"
    }
  }


  var compare = (amount: Double, formatter: (Double) => String) => {
    println(s"${amount} vs 0: ${formatter(amount)}")
  }

  println("Implementation with if..else")
  compare(10, implA)
  compare(0, implA)
  compare(-10, implA)

  var implB = (amount: Double) => {
    amount match {
      case x: Double if x > 0 => "greater"
      case x: Double if x < 0 => "less"
      case x: Double => "same"
    }
  }

  println()
  println("Implementation with match")
  compare(10, implB)
  compare(0, implB)
  compare(-10, implB)


}
