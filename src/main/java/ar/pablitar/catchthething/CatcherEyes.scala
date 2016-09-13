package ar.pablitar.catchthething

import ar.pablitar.vainilla.commons.components.RichGameComponent
import ar.pablitar.vainilla.commons.math.Vector2D
import ar.pablitar.vainilla.appearances.TimedAppearance

class CatcherEyes extends RichGameComponent[CatchTheThingScene] {
  this.setZ(-1)
  override val appearanceCenter = -Vector2D(Resources.macetaIdle.getX, Resources.macetaIdle.getY)
  
  this.setAppearance(Resources.macetaIdleEyes)

  def onCaught() = {
    Resources.macetaEyesAnimation.reset()
    this.setAppearance(TimedAppearance.fromAnimationTo(this, Resources.macetaEyesAnimation, Resources.macetaIdleEyes))
  }
}