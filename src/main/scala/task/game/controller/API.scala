package task.game.controller

import scala.util.Random
import task.game.common.EnumerationString.Answer.{draw, player1Win, player2Win}
import task.game.common.EnumerationString.StringValue
import task.game.model._
import task.game.model.kind._

object API {
  private val rnd = new Random
  
  /** It is list with all shapes object */
  val getListShapes: List[CommonShapes] = List(new Rock, new Lizard, new Paper, new Scissors, new Spock)
 
  /** It is list with all kind of shapes */
  private val listKind = getListShapes.map(_.kind)
  
  /**
    * This method define who win player1 or player2
    *
    * @param nameKind KindShapes which player1 chose
    * @param randomKind KindShapes is random
    * @return AnswerShapes
    */
  def checkWinner(nameKind: KindShapes, randomKind: KindShapes): AnswerShapes = {
    getListShapes.map(shapes =>
      if (shapes.kind == nameKind) shapes.check(randomKind)
      else Default
    ).filter(_ != Default).head
  }
  
  /**
    * This method define what need to print
    *
    * @param answer AnswerShapes
    * @return StringValue
    */
  def defineWinner(answer: AnswerShapes): StringValue = answer match {
    case Win => player1Win
    case Lose => player2Win
    case Draw => draw
  }
  
  /**
    * This method define random KindShapes
    *
    * @return random KindShapes
    */
  def randomShapes: KindShapes = listKind(rnd.nextInt(listKind.size))
  
  /**
    * This method define full path to image
    *
    * @param kind KindShapes which path to need
    * @return String full path
    */
  def getPath(kind: KindShapes): String = getListShapes.filter(_.kind == kind).head.pathToFile
}
