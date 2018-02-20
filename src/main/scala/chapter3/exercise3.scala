package chapter3

object exercise3 extends App {
  println("Chapter 3, Exercise 3")

  val hexCyan= "#00FFFF"
  val hexMagenta = "#FF00FF"
  val hexYellow = "#FFFF00"
  val hexError = "#??????"

  var toHex = (color: String) => {
    color match {
      case "cyan" => hexCyan
      case "magenta" => hexMagenta
      case "yellow" => hexYellow
      case _ => hexError
    }
  }

  val printColorWithHex = (color: String) => {
    println(s"Color ${color} has HTML hex code ${toHex(color)}")
  }

  printColorWithHex("cyan")
  printColorWithHex("magenta")
  printColorWithHex("yellow")
  printColorWithHex("purple")
}
