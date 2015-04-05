package org.mabrarov.scala.learn.golovachcourses.scalawithjava

class Greeter {

  def greet(name: String) = {
    val myJavaClass = new GreetingBuilder()
    println(myJavaClass.buildGreeting(name))
  }
}
