package task.game.model

import task.game.model.kind.{AnswerShapes, KindShapes}

trait CommonShapes {
  /** It is an abstract name of shapes that using in name of image and name of button */
  val name: String
  /** It is an abstract kind of shapes that using in defining which object using naw need contains name of shape*/
  val kind: KindShapes
 
  /**
    * It is an abstract method that check the shapes win or lose
    *
    * @param kind KindShapes
    * @return AnswerShapes
    */
  def check(kind: KindShapes): AnswerShapes
  
  /**
    * This method complete full path to image
    *
    * @return String path to image
    */
  def pathToFile: String = "/" + name + ".png"
}
