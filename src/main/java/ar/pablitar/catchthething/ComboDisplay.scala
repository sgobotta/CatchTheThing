package ar.pablitar.catchthething

import com.uqbar.vainilla.appearances.Label
import java.awt.Font
import java.awt.Color
import ar.pablitar.vainilla.commons.components.RichGameComponent

class ComboDisplay(scene: CatchTheThingScene) extends RichGameComponent[CatchTheThingScene] {
  var points = 0
  
  def getPoints = { this.points }
  
  this.setScene(scene)

  this.updateLabel

  this.setX(40)
  this.setY(70)

  
  def updateLabel = {
    this.setAppearance(new Label(new Font(Font.SANS_SERIF, Font.BOLD, 16), Color.BLACK, "Combo: " + points))
  }

  def sumScore: Unit = {
    points += 1
    this.updateLabel
  }
  
  def sumScore(n: Int) {
    points += n
    this.updateLabel
  }
  
  def score(ball: Ball) = {
  }
  
  def score = {
    this.sumScore
  }
  
  def resetScore = {
    points = 0
    this.updateLabel
  }
  
}