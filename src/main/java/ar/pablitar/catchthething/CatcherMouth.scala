package ar.pablitar.catchthething

import ar.pablitar.vainilla.commons.components.RichGameComponent
import ar.pablitar.vainilla.commons.math.Vector2D
import ar.pablitar.vainilla.appearances.TimedAppearance

class CatcherMouth extends RichGameComponent[CatchTheThingScene] {
  this.setZ(-1)
  override val appearanceCenter = -Vector2D(Resources.macetaIdle.getX, Resources.macetaIdle.getY)
  
  this.setAppearance(Resources.macetaIdleMouth)

  def onCaught() = {
    Resources.macetaMouthAnimation.reset()
    this.setAppearance(TimedAppearance.fromAnimationTo(this, Resources.macetaMouthAnimation, Resources.macetaIdleMouth))
  }
}