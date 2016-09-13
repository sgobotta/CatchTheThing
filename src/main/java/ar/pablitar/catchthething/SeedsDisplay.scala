package ar.pablitar.catchthething

import com.uqbar.vainilla.appearances.Label
import java.awt.Font
import java.awt.Color
import ar.pablitar.vainilla.commons.components.RichGameComponent

class SeedsDisplay(scene: CatchTheThingScene) extends RichGameComponent[CatchTheThingScene] {
  var points = 0
  def getPoints = { this.points }
  
  this.setScene(scene)

  this.updateLabel

  this.setX(40)
  this.setY(40)

  
  def updateLabel = {
    this.setAppearance(new Label(new Font(Font.SANS_SERIF, Font.BOLD, 16), Color.BLACK, "Seeds: " + points))
  }

  def sumScore: Unit = {
    points += 1
    this.updateLabel
  }
  
  def sumScore(n: Int) {
  }
  
  def score = {
    this.sumScore
  }
  
  def resetScore = {
  }
  
}