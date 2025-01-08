package game_management

import models.card.Card
import models.hand.{Hand, HandPosition, OrderDependent, PositionSpecifier}

case class GameStatus(
                     firstHand: Hand,
                     secondHand: Hand
                     ) {
  def cardInHand(handPosition: HandPosition): Card =
    getCard(handPosition)

  private def getCard[T <: OrderDependent & PositionSpecifier](t: T): Card =
    if (t.order == PlayerOrder.First) firstHand(t.position)
    else secondHand(t.position)
}
