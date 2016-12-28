package task.game.view

import scala.swing._
import scala.swing.event.ButtonClicked
import task.game.controller.API
import task.game.common.EnumerationString._
import task.game.common.EnumerationString.NameLabel.{labelStart, player2, player1}
import task.game.common.SettingsGUI.sizeFrame

class GUIPlayerVSComputer extends ProcessingFramePlayer {
  
  /** It is List of Buttons that use for clicking */
  val listButton = API.getListShapes.map(getButton)
  /** It is a Label that use for set answer with winner*/
  val labelAnswer = getLabel(labelStart)
  /** It is a Label that use for player2 and set image */
  val labelImage = getLabel("")
  
  /** It is a Frame that use for playing Player VS Computer */
  val newFrame: Frame = new Frame() {
    visible = true
    title = playerGUITitle
    
    contents = new BoxPanel(Orientation.Horizontal) {
      contents += new BorderPanel {
        add(getBoxButton(listButton, getLabel(player1)), BorderPanel.Position.West)
      }
      contents += new BorderPanel {
        add(getBoxLabel(labelAnswer, labelImage, getLabel(player2)), BorderPanel.Position.Center)
      }
    }
    
    minimumSize = sizeFrame
    maximumSize = sizeFrame
    preferredSize = sizeFrame
    centerOnScreen()
    
    listButton.foreach(x => listenTo(x))
    
    reactions += {
      case ButtonClicked(button) => answerPlayer(button.name, labelAnswer, labelImage)
    }
  }
}
