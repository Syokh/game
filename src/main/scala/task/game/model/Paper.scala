package task.game.model

import task.game.model.kind._

class Paper extends CommonShapes {
  val name: String = "paper"
  val kind: KindShapes = PaperType
  
  def check(kind: KindShapes): AnswerShapes = kind match {
    case RockType | SpockType => Win
    case ScissorsType | LizardType => Lose
    case _ => Draw
  }
}
