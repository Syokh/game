package task.game.model

import task.game.model.kind._

class Scissors extends CommonShapes {
  val name: String = "scissors"
  val kind: KindShapes = ScissorsType
  
  def check(kind: KindShapes): AnswerShapes = kind match {
    case LizardType | PaperType => Win
    case RockType | SpockType => Lose
    case _ => Draw
  }
}
