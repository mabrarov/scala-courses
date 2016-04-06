package org.mabrarov.scala.learn.golovachcourses.intro

/**
 * Companion class
 */
class Example {

  def inc(x: Int) = x + 1
}

/**
 * Object
 */
object Example extends App {

  def dec(x: Int) = x - 1

  println(dec(new Example().inc(0)))

}
