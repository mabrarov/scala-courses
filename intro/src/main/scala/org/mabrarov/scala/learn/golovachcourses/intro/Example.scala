package org.mabrarov.scala.learn.golovachcourses.intro

/**
 * Companion class
 */
class Example {

  def inc(x: Int): Int = {
    x + 1
  }
}

/**
 * Object
 */
object Example {

  def dec(x: Int): Int = {
    x - 1
  }

  def main(args: Array[String]) {
    println("Hello, World!")
    println(dec(new Example().inc(0)))
  }
}
