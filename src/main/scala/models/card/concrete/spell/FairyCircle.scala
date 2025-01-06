package models.card.concrete.spell

import models.card.{Attack, CardClass, CardName, Cost, Follower, FollowerHealth, Spell}

case class FairyCircle(
                        cardClass: CardClass,
                        name: CardName,
                        cost: Cost,
                      ) extends Spell(cardClass, name, cost)

object FairyCircle {
  def apply(): FairyCircle = new FairyCircle(
    cardClass = CardClass.Neutral,
    name = CardName.applyUnsafe("FairyCircle"),
    cost = Cost.applyUnsafe(1)
  )
}