package org.mabrarov.scala.learn.golovachcourses.scalawithjava

class Greeter {

  def greet(name: String) = {
    val greetingBuilder = new GreetingBuilder()
    println(greetingBuilder.buildGreeting(name))
  }
}
