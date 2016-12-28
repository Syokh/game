package task.game.controller

import org.scalatest.FlatSpec
import task.game.view.CommonProcessing

class TestView extends FlatSpec with CommonProcessing {
  "The method getLabel" should "pop Label with text 'Example'" in {
    assert(getLabel("Example").text == "Example")
  }
  
  "The method getButton" should "pop Button with text 'Example'" in {
    assert(getButton("Example").text == "Example")
  }
  
  "The method getImageIcon" should "pop Button with text 'Example'" in {
    assert(getImageIcon("some/path/Example").getDescription == null)
  }
}
