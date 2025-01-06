package models.hand

import models.card.Card
import models.card.concrete.follower.{Goblin, WaterFairy}
import models.card.concrete.spell.FairyCircle

import scala.util.Random

case class Hand(cards: List[Card])

object Hand:
  lazy val initialHand: Hand =
    val cards: List[Card] = List.fill(2)(WaterFairy()) ++ List.fill(2)(Goblin()) ++ List.fill(1)(FairyCircle())
    Hand(Random.shuffle(cards))

