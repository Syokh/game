package task.game.model.kind

sealed trait KindShapes

case object RockType extends KindShapes
case object PaperType extends KindShapes
case object ScissorsType extends KindShapes
case object LizardType extends KindShapes
case object SpockType extends KindShapes

object KindShapes{
  /**
    * This method convert from String to KindShapes if KindShapes contains this String
    *
    * @param s String name of shapes
    * @return KindShapes
    */
  implicit def fromString(s: String): KindShapes = {
   Vector(RockType, PaperType, ScissorsType, LizardType, SpockType).find(_.toString.toLowerCase.contains(s.toLowerCase)).get
  }
}
