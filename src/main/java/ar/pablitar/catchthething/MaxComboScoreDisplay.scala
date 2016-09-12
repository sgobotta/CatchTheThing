package ar.pablitar.catchthething

import com.uqbar.vainilla.appearances.Label
import java.awt.Font
import java.awt.Color
import ar.pablitar.vainilla.commons.components.RichGameComponent

class MaxComboScoreDisplay(scene: CatchTheThingScene) extends RichGameComponent[CatchTheThingScene] {
  var combo = 0
  
  this.setScene(scene)

  this.updateLabel

  this.setX(40)
  this.setY(100)

  
  def updateLabel = {
    this.setAppearance(new Label(new Font(Font.SANS_SERIF, Font.BOLD, 16), Color.WHITE, "Max Combo: " + combo))
  }

  def sumScore: Unit = {
    combo += 1
    this.updateLabel
  }
  
  def sumScore(currentScore: Int) {
    if(currentScore > combo)
    this.sumScore
  }
  
  def score(n: Int) = {
    this.sumScore(n)
  }
  
}