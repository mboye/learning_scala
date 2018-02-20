package chapter3

object exercise1 extends App {
  println("Chapter 3, Exercise 1")

  var formatName = (name: String) => {
    name match {
      case name: String if !name.isEmpty => name
      case _ => "n/a"

    }
  }

  println("Name: " + formatName("Magnus"))
  println("Name: " + formatName(""))
  println("Name: " + formatName(null))
}
