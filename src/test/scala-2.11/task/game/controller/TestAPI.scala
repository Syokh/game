package task.game.controller

import org.scalatest.FlatSpec
import task.game.common.EnumerationString.Answer._
import task.game.model.kind._

class TestAPI extends FlatSpec {
  "The method getListShapes" should "pop list with 5 elements" in {
    assert(API.getListShapes.size == 5)
  }
  
  "The method checkWinner" should "pop Draw" in {
    assert(API.checkWinner(RockType, RockType) == Draw)
  }
  
  "The method checkWinner" should "pop Win" in {
    assert(API.checkWinner(RockType, LizardType) == Win)
  }
  
  "The method checkWinner" should "pop Lose" in {
    assert(API.checkWinner(RockType, SpockType) == Lose)
  }
  
  "The method defineWinner" should "pop player1 win" in {
    assert(API.defineWinner(Win) == player1Win)
  }
  
  "The method defineWinner" should "pop player2 win" in {
    assert(API.defineWinner(Lose) == player2Win)
  }
  
  "The method defineWinner" should "pop Draw" in {
    assert(API.defineWinner(Draw) == draw)
  }
  
  "The method getPath" should "pop the all path" in {
    API.getListShapes.foreach { shapes =>
      val path = API.getPath(shapes.kind)
      val name = path.split('/').last.split('.').head
      assert(shapes.name == name)
    }
  }
}
