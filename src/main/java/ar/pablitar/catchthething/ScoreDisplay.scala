package ar.pablitar.catchthething

import com.uqbar.vainilla.appearances.Label
import java.awt.Font
import java.awt.Color
import ar.pablitar.vainilla.commons.components.RichGameComponent

class ScoreDisplay(scene: CatchTheThingScene) extends RichGameComponent[CatchTheThingScene] {
  var points = 0
  var magicValue = 1
  
  def setMagicValue(n: Int) = {
    magicValue = n
  }
  
  def getPoints = { this.points }
  
  this.setScene(scene)

  this.updateLabel

  this.setX(40)
  this.setY(10)

  
  def updateLabel = {
    this.setAppearance(new Label(new Font(Font.SANS_SERIF, Font.BOLD, 16), Color.BLACK, "Score: " + points))
  }

  def sumScore: Unit = {
    points += 1
    this.updateLabel
  }
  
  def sumScore(n: Int) {
    points += n * magicValue
    this.updateLabel
  }
  
  def score(ball: Ball, currentCombo: Int) = {
    this.applyMagicValue(currentCombo)
    this.sumScore(ball.getScoreValue)
  }
  
  def applyMagicValue(currentCombo: Int) = {
    if (this.isBetween(currentCombo, baby, rookie)) this.setMagicValue(3)
    else if (this.isBetween(currentCombo, rookie, gardener)) this.setMagicValue(9)
    else if (this.isBetween(currentCombo, gardener, farmer)) this.setMagicValue(27)
    else if (currentCombo >= farmer) this.setMagicValue(81)
    else this.setMagicValue(1)
  }
  
  def isBetween(c: Int, x: Int, y: Int) = {
    c >= x && c < y
  }
  
  def baby     = { 3 }
  def rookie   = { 7 }
  def gardener = { 10 }
  def farmer   = { 12 }
  
  def resetScore = {
  }
  
}