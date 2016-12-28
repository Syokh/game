package task.game.view

import java.util.Timer
import scala.swing._
import scala.swing.event.ButtonClicked
import task.game.common.EnumerationString.NameButton.{click, start, stop}
import task.game.common.EnumerationString.NameLabel._
import task.game.common.EnumerationString._
import task.game.common.SettingsGUI._

class GUIComputerVSComputer extends ProcessingFrameComputer {
  /** It is object Timer that use for schedule */
  var timer = new Timer
  
  /** It is a Button that use for one click */
  val buttonClick = getButton(click)
  /** It is a Button that use for start schedule */
  val buttonStart = getButton(start)
  /** It is a Button that use for stop schedule */
  val buttonStop = getButton(stop)
  
  /** It is a Label that use for player1 and set image */
  val labelImagePlayer1 = getLabel(labelPlayer1)
  /** It is a Label that use for player2 and set image */
  val labelImagePlayer2 = getLabel(labelPlayer2)
  /** It is a Label that use for set answer with winner */
  val labelAnswer = getLabel(labelStartComputor)
  
  /** It is a Frame that use for playing Computer VS Computer */
  val newFrame: Frame = new Frame() {
    visible = true
    title = computerGUITitle
    
    contents = new BoxPanel(Orientation.Horizontal) {
      contents += new BorderPanel {
        add(boxPanelLabel(getLabel(player1), labelImagePlayer1), BorderPanel.Position.West)
        add(labelAnswer, BorderPanel.Position.Center)
        add(boxPanelLabel(getLabel(player2), labelImagePlayer2), BorderPanel.Position.East)
        add(boxPanelButton(buttonClick, buttonStart, buttonStop), BorderPanel.Position.South)
      }
      
    }
    
    minimumSize = sizeFrame
    maximumSize = sizeFrame
    preferredSize = sizeFrame
    centerOnScreen()
    
    listenTo(buttonClick, buttonStart, buttonStop)
    
    reactions += {
      case ButtonClicked(button) => checkClickButton(button)
    }
  }
  
  /**
    * This method check click on button and set answer
    *
    * @param button reactions AbstractButton
    */
  def checkClickButton(button: AbstractButton): Unit ={
    button.text match {
      case x if x == click.toString =>
        answerPlayer(labelImagePlayer1, labelImagePlayer2, labelAnswer)
      case x if x == start.toString =>
        timer.schedule(timerTask(labelImagePlayer1, labelImagePlayer2, labelAnswer), delaySchedule, periodSchedule)
      case x =>
        timer.cancel()
        timer = new Timer
    }
  }
}
