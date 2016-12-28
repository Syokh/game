package task.game.model.kind

sealed trait AnswerShapes

case object Win extends AnswerShapes
case object Lose extends AnswerShapes
case object Draw extends AnswerShapes
case object Default extends AnswerShapes
