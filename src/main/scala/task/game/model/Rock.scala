package task.game.model

import task.game.model.kind._

class Rock extends CommonShapes {
  val name: String = "rock"
  val kind: KindShapes = RockType
  
  def check(kind: KindShapes): AnswerShapes = kind match {
    case LizardType | ScissorsType => Win
    case PaperType | SpockType => Lose
    case _ => Draw
  }
}


