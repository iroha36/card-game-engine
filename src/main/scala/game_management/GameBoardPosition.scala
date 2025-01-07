package game_management

import game_management.DetailedPosition.HandPosition
import io.github.iltotore.iron.{:|, RefinedTypeOps}
import io.github.iltotore.iron.constraint.numeric.{GreaterEqual, LessEqual}

import io.github.iltotore.iron.autoRefine
import scala.math.Ordered.orderingToOrdered
import scala.math.Ordering.Implicits.infixOrderingOps


import java.text.FieldPosition

type HandPosition2 = Int :| GreaterEqual[0] | LessEqual[4]
type FieldPosition2 = Int :| GreaterEqual[5] | LessEqual[40]

enum DetailedPosition {
  case HandPosition(position: HandPosition2)
  case FieldPosition(position: FieldPosition2)
}


case class GameBoardPosition(value:Position) {
  
}

type Position = Int :| GreaterEqual[0] | LessEqual[40]
object GameBoardPosition extends RefinedTypeOps[Int, GreaterEqual[0] | LessEqual[40], Position]
