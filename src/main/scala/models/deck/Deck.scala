package models.deck

import models.card.Card
import models.card.concrete.follower.{Goblin, WaterFairy}
import models.card.concrete.spell.FairyCircle
import util.{CardContainer, ContainerOps}

import scala.util.Random

case class Deck(cards: List[Card]) extends CardContainer[Deck](cards)

object Deck {
  given ContainerOps[Deck] = ContainerOps.makeOps(Deck.apply)

  lazy val initialDeck: Deck =
    val cards: List[Card] = List.fill(10)(WaterFairy()) ++ List.fill(10)(Goblin()) ++ List.fill(10)(FairyCircle())
    Deck(Random.shuffle(cards))
}
