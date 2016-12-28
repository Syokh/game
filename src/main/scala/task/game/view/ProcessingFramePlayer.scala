package task.game.view

import scala.swing._
import task.game.common.EnumerationString.enumToString
import task.game.controller.API
import task.game.model.kind.KindShapes.fromString

trait ProcessingFramePlayer extends CommonProcessing {
  /**
    * This method set all button using Orientation.Vertical
    *
    * @param listButtons List[Button] it is List with buttons that need to set
    * @param labelComputer Label need to set name of player
    * @return new BoxPanel
    */
  def getBoxButton(listButtons: List[Button], labelComputer: Label): BoxPanel =
    new BoxPanel(Orientation.Vertical) {
      contents += labelComputer
      contents ++= listButtons
    }
  
  /**
    * This method set all Label using Orientation.Horizontal
    *
    * @param labelAnswer Label need to set answer
    * @param labelImage Label need to set image
    * @param labelComputer Label need to set name of player
    * @return new BoxPanel
    */
  def getBoxLabel(labelAnswer: Label, labelImage: Label, labelComputer: Label): BoxPanel =
    new BoxPanel(Orientation.Horizontal) {
      contents += new BorderPanel {
        add(labelComputer, BorderPanel.Position.North)
        add(labelImage, BorderPanel.Position.Center)
        add(labelAnswer, BorderPanel.Position.South)
      }
    }
  
  /**
    * This method complete and set answer
    *
    * @param name String name of button
    * @param labelAnswer Label need to set answer
    * @param labelImage Label need to set image
    */
  def answerPlayer(name: String, labelAnswer: Label, labelImage: Label): Unit = {
    val rand = API.randomShapes
    labelImage.icon = getImageIcon(API.getPath(rand))
    val answer = API.checkWinner(name, rand)
    labelAnswer.text = API.defineWinner(answer)
  }
}
