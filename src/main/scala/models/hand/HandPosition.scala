package models.hand

import game_management.{Side, PlayerOrder}
import io.github.iltotore.iron.:|
import io.github.iltotore.iron.constraint.numeric.{GreaterEqual, LessEqual}

trait OrderDependent {
  val order: PlayerOrder
}
trait PositionSpecifier {
  val position: Int
}
case class HandPosition(position: HandPosition.Position, order: PlayerOrder) extends OrderDependent, PositionSpecifier

object HandPosition {
  type Position = Int :| (GreaterEqual[1] & LessEqual[10]) 
}

