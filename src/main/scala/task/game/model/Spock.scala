package task.game.model

import task.game.model.kind._

class Spock extends CommonShapes {
  val name: String = "spock"
  val kind: KindShapes = SpockType
  
  def check(kind: KindShapes): AnswerShapes = kind match {
    case RockType | ScissorsType => Win
    case PaperType | LizardType => Lose
    case _ => Draw
  }
}
