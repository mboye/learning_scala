package chapter3

object exercise5 extends App {
  println("Chapter 3, Exercise 5")

  for (i <- 1 to 100) {
    i match {
      case i: Int if (i % 3 == 0 && i % 5 == 0) => println("typesafe")
      case i: Int if (i % 3 == 0) => println("type")
      case i: Int if (i % 5 == 0) => println("safe")
      case i: Int => println(i)
    }
  }
}
