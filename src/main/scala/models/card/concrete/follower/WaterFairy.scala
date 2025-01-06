package models.card.concrete.follower

import models.card.*

case class WaterFairy(
                   cardClass: CardClass,
                   name: CardName,
                   cost: Cost,
                   attack: Attack,
                   health: FollowerHealth,
                 ) extends Follower(cardClass, name, cost, attack, health)

object WaterFairy {
  def apply(): WaterFairy = new WaterFairy(
    cardClass = CardClass.Forestcraft,
    name = CardName.applyUnsafe("Water Fairy"),
    cost = Cost.applyUnsafe(1),
    attack = Attack.applyUnsafe(1),
    health = FollowerHealth.applyUnsafe(1)
  )
}
