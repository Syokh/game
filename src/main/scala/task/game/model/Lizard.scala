package task.game.model

import task.game.model.kind._

class Lizard extends CommonShapes {
  val name: String = "lizard"
  val kind: KindShapes = LizardType
  
  def check(kind: KindShapes): AnswerShapes = kind match {
    case PaperType | SpockType => Win
    case ScissorsType | RockType => Lose
    case _ => Draw
  }
}
