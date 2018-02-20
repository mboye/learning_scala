package chapter3

object exercise4 extends App {
  println("Chapter 3, Exercise 4")

  val groupSize = 5
  val lastNumber = 100

  for (i <- 1 to lastNumber) {
    i match {
      case i: Int if i == lastNumber => println(i)
      case i: Int if i % 5 == 0 => println(s"${i}, ")
      case i: Int => print(s"${i}, ")
    }
  }
}
