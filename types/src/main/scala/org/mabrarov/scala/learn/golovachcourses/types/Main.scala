package org.mabrarov.scala.learn.golovachcourses.types

object Main extends App {

  val entity = new Entity
  entity.name = "Test entity"
  printf("name: %s, created: %s, modified: %s", entity.name, entity.created, entity.modified)

}
