package task.game

import scala.swing._
import task.game.common.EnumerationString._
import task.game.common.SettingsGUI.sizesMainFrame
import task.game.view.{GUIComputerVSComputer, GUIPlayerVSComputer}

object Main extends App {
  val frame = new MainFrame {
    title = mainGUITitle
    
    minimumSize = sizesMainFrame
    maximumSize = sizesMainFrame
    preferredSize = sizesMainFrame
    centerOnScreen()
    
    menuBar = new MenuBar {
      contents += new Menu(nameMenu) {
        contents += new MenuItem(
          new Action(nameButtonPlayerVSComputer) {
            def apply {
              new GUIPlayerVSComputer
            }
          })
        
        contents += new MenuItem(
          new Action(nameButtonComputerVSComputer) {
            def apply {
              new GUIComputerVSComputer
            }
          })
      }
    }
  }
  
  frame.visible = true
}