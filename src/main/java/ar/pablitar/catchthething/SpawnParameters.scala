package ar.pablitar.catchthething

import ar.pablitar.vainilla.commons.math.Vector2D
import scala.util.Random

class SpawnParameters {

  val set = Set(0,800)
  val xPosition = set.toVector(Random.nextInt(set.size))
  var speed : Vector2D = null
  this.generateSpawnParameters
  
  def generateSpawnParameters = {
    if (this.xPosition == 0) this.speed = (Random.nextInt(800), 0)
    else if (this.xPosition == 800) this.speed = (-(Random.nextInt(800)), 0)
  }
}