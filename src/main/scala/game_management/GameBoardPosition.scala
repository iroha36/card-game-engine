package game_management

import io.github.iltotore.iron.constraint.numeric.{GreaterEqual, LessEqual}
import io.github.iltotore.iron.*

case class GameBoardPosition(value: Position) {
  def specify: String = if (value < 4) "a" else "b"
}

type Position = Int :| (GreaterEqual[1] & LessEqual[18] & GreaterEqual[51] & LessEqual[68])

object GameBoardPosition extends RefinedTypeOps[Int, GreaterEqual[0] & LessEqual[40], Position]
