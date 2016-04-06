package org.mabrarov.scala.learn.golovachcourses.types

import java.time.Instant
import java.util.Optional

class Entity {

  var name: String = _
  val created: Instant = Instant.now()
  var modified: Optional[Instant] = Optional.empty()

}
