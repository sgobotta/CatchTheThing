package ar.pablitar.catchthething

import com.uqbar.vainilla.GameScene
import com.uqbar.vainilla.GameComponent
import ar.pablitar.vainilla.commons.math.Vector2D

class CatchTheThingScene extends GameScene {
  val scoreDisplay = new ScoreDisplay(this)
  val seedsDisplay = new SeedsDisplay(this)
  val comboDisplay = new ComboDisplay(this)
  val maxComboDisplay = new MaxComboScoreDisplay(this)
  val feedback = new FeedbackManager(this, scoreDisplay, seedsDisplay, comboDisplay, maxComboDisplay)
  
  val catcher = new Catcher(this, new CatcherShadow, new CatcherEyes, new CatcherMouth, new CatcherSmile)
  val background = new GameComponent
  background.setAppearance(Resources.background)
  background.setZ(-50)
  
  this.addComponent(scoreDisplay)
  this.addComponent(seedsDisplay)
  this.addComponent(comboDisplay)
  this.addComponent(maxComboDisplay)
  this.addComponent(background)
  this.addComponent(catcher.eyes)
  this.addComponent(catcher)
  this.addComponent(catcher.shadow)
  this.addComponent(catcher.mouth)
  //this.addComponent(catcher.smile)
  this.addComponent(new BallSpawner(this))
  this.addComponent(new Sun(Vector2D(575, 85)))
  
  
  def score(ball: Ball): Unit = {
    feedback.score(ball)
  }
  
  def resetScore : Unit = {
    feedback.resetScore
  }
  
}