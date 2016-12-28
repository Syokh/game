package task.game.common

object EnumerationString extends Enumeration {
  /** It is a common type*/
  type StringValue = Value
  
  /** It is a name of main frame*/
  val mainGUITitle = Value("GameRockPaperScissors")
  /** It is a name of frame Player vs Computer*/
  val playerGUITitle = Value("Player vs Computer")
  /** It is a name of frame Computer vs Computer*/
  val computerGUITitle = Value("Computer vs Computer")
  /** It is a name of MenuBar in main frame*/
  val nameMenu = Value("File")
  /** It is a name of Button that call the frame Player vs Computer*/
  val nameButtonPlayerVSComputer = Value("New Game Player vs Computer")
  /** It is a name of Button that call the frame Computer vs Computer*/
  val nameButtonComputerVSComputer = Value("New Game Computer vs Computer")
  
  object Answer {
    /** It is a text that print if Player1 is win*/
    val player1Win = Value("Player1 Win")
    /** It is a text that print if Player2 is win*/
    val player2Win = Value("Player2 Win")
    /** It is a text that print if both players have Draw*/
    val draw = Value("Draw")
  }
  
  object NameButton {
    /** It is a name of button that use in the frame Computer vs Computer*/
    val click = Value("click")
    /** It is a name of button that use in the frame Computer vs Computer and started the scheduler */
    val start = Value("start")
    /** It is a name of button that use in the frame Computer vs Computer and stopped the scheduler */
    val stop = Value("stop")
  }
  
  object NameLabel {
    /** It is a name of label that use in the frame Computer vs Computer need to set image for Player1*/
    val labelPlayer1 = Value("No button clicks")
    /** It is a name of label that use in the frame Computer vs Computer need to set image for Player2*/
    val labelPlayer2 = Value("No button clicks")
    /** It is a name of label that use in the frame Computer vs Computer need to set answer*/
    val labelStartComputor = Value("Click on button 'click'")
    /** It is a name of Player which is playing*/
    val player1 = Value("Player1")
    /** It is a name of Computer which is playing*/
    val player2 = Value("Player2")
    /** It is a name of label that use in the frame Player vs Computer need to set answer*/
    val labelStart = Value("Click on any button")
  }
  
  /**
    * This method convert from Enumeration the String
    *
    * @param enum StringValue it is Enumeration
    * @return String
    */
  implicit def enumToString(enum: StringValue): String = enum.toString
}
