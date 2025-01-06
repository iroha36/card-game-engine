package game_management

import models.deck.Deck
import models.hand.Hand

object GameMaster {
  def run(): Unit = {
    val deck1 = Deck.initialDeck
    val deck2 = Deck.initialDeck
    val hand1 = Hand.initialHand
    val hand2 = Hand.initialHand
  }
}

