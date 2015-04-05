package org.mabrarov.scala.learn.golovachcourses.scalawithjava

object Main {

  def main(args: Array[String]) {
    val greeter = new Greeter()
    if (args.length == 0) {
      greeter.greet("World")
    } else {
      greeter.greet(args.apply(0))
    }
  }
}
