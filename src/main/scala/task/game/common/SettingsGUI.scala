package task.game.common

import java.awt.{Color, Dimension, Font}

object SettingsGUI {
  /** It is a size of the main Frame */
  val sizesMainFrame = new Dimension(1500, 1500)
  /** It is a size of Frames Computer VS Computer and Player VS Computer */
  val sizeFrame = new Dimension(1500, 1500)
  /** It is a size of all Label */
  val sizeLabel = new Dimension(200, 200)
  /** It is a size of all Button */
  val sizeButton = new Dimension(200, 200)
  /** It is a size and font of the text inside Label and Button */
  val fontText = new Font("Arial", 0, 25)
  /** It is a color of the text inside Label and Button */
  val textColor = Color.blue
  /** It is a width of all images */
  val widthImg: Int = 200
  /** It is a height of all images */
  val heightImg: Int = 200
  /** It is a delay for start scheduler in milliseconds */
  val delaySchedule: Long = 100
  /** It is a period for repeat scheduler in milliseconds */
  val periodSchedule: Long = 1000
}
