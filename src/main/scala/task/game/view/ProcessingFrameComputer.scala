package task.game.view

import java.util.TimerTask
import scala.swing._
import task.game.common.EnumerationString.enumToString
import task.game.controller.API

trait ProcessingFrameComputer extends CommonProcessing {
  /**
    * This method need for object Timer and use for schedule
    *
    * @param labelPlayer1 Label need to set image for Player1
    * @param labelPlayer2 Label need to set image for Player2
    * @param label Label need to set answer
    * @return new TimerTask
    */
  def timerTask(labelPlayer1: Label, labelPlayer2: Label, label: Label) = new TimerTask {
    override def run(): Unit = {
      answerPlayer(labelPlayer1, labelPlayer2, label)
    }
  }
  
  /**
    * This method complete and set answer
    *
    * @param labelPlayer1 Label need to set image for Player1
    * @param labelPlayer2 Label need to set image for Player2
    * @param labelAnswer Label need to set answer
    */
  def answerPlayer(labelPlayer1: Label, labelPlayer2: Label, labelAnswer: Label): Unit = {
    val random1 = API.randomShapes
    val random2 = API.randomShapes
    labelPlayer1.icon = getImageIcon(API.getPath(random1))
    labelPlayer1.text = ""
    labelPlayer2.icon = getImageIcon(API.getPath(random2))
    labelPlayer2.text = ""
    val answer = API.checkWinner(random2, random1)
    labelAnswer.text = API.defineWinner(answer)
  }
  
  /**
    * This method set all button using Orientation.Horizontal
    *
    * @param buttonClick Button that use for one click
    * @param buttonStart Button that use for start schedule
    * @param buttonStop Button that use for stop schedule
    * @return new BoxPanel
    */
  def boxPanelButton(buttonClick: Button, buttonStart: Button, buttonStop: Button): BoxPanel = {
    new BoxPanel(Orientation.Horizontal) {
      contents += new BorderPanel {
        add(buttonClick, BorderPanel.Position.West)
        add(buttonStart, BorderPanel.Position.Center)
        add(buttonStop, BorderPanel.Position.East)
      }
    }
  }
  
  /**
    * This method set all Label using Orientation.Vertical
    *
    * @param labelName Label need to set name of player
    * @param labelImage Label need to set image
    * @return new BoxPanel
    */
  def boxPanelLabel(labelName: Label, labelImage: Label): BoxPanel = new BoxPanel(Orientation.Vertical) {
    contents += new BorderPanel {
      add(labelName, BorderPanel.Position.North)
      add(labelImage, BorderPanel.Position.Center)
    }
  }
}
