package ar.pablitar.catchthething

import ar.pablitar.vainilla.commons.components.RichGameComponent

class FeedbackManager(scene: CatchTheThingScene, scoreBoard: ScoreDisplay, seedsBoard: SeedsDisplay, comboBoard: ComboDisplay, maxComboBoard: MaxComboScoreDisplay) extends RichGameComponent[CatchTheThingScene]{
  
  val score    = scoreBoard
  val seeds    = seedsBoard
  val combo    = comboBoard
  val maxCombo = maxComboBoard
  
  def score(ball: Ball) : Unit = {
    seeds.score
    score.score(ball, combo.getPoints)
    combo.score
    maxCombo.score(combo.getPoints)
  }
  
  def resetScore : Unit = {
    combo.resetScore
  }
  
}