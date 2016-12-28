package task.game.view

import javax.imageio.ImageIO
import javax.swing.ImageIcon
import scala.swing.{Button, Label}
import task.game.common.SettingsGUI._
import task.game.model.CommonShapes

trait CommonProcessing {
  /**
    * This method create a new Button for Computer VS Computer
    *
    * @param name String name of Button
    * @return new Button
    */
  def getButton(name: String): Button = new Button(name) {
    minimumSize = sizeButton
    maximumSize = sizeButton
    preferredSize = sizeButton
    font = fontText
    foreground = textColor
  }
  
  /**
    * This method create a new Button with Image for Player VS Computer
    *
    * @param shapes CommonShapes kind of Shapes
    * @return new Button
    */
  def getButton(shapes: CommonShapes): Button = new Button("") {
    name = shapes.name
    minimumSize = sizeButton
    maximumSize = sizeButton
    icon = getImageIcon(shapes.pathToFile)
    preferredSize = sizeButton
  }
  
  /**
    * This method create a new ImageIcon
    *
    * @param path String path to Image
    * @return new ImageIcon
    */
  def getImageIcon(path: String): ImageIcon = {
    val inputStream = classOf[ImageIcon].getResourceAsStream(path)
    val image = new ImageIcon(ImageIO.read(inputStream)).getImage
    val newImg = image.getScaledInstance(widthImg, heightImg, java.awt.Image.SCALE_SMOOTH)
    new ImageIcon(newImg)
  }
  
  /**
    * This method create a new Label
    *
    * @param textName String name of Label
    * @return new Label
    */
  def getLabel(textName: String): Label = new Label {
    text = textName
    minimumSize = sizeLabel
    maximumSize = sizeLabel
    font = fontText
    foreground = textColor
    preferredSize = sizeLabel
  }
}
