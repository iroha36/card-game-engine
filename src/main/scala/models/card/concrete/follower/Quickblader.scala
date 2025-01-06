package models.card.concrete.follower

import models.card.*

case class Quickblader(
                   cardClass: CardClass,
                   name: CardName,
                   cost: Cost,
                   attack: Attack,
                   health: FollowerHealth,
                 ) extends Follower(cardClass, name, cost, attack, health)

object Quickblader {
  def apply(): Quickblader = new Quickblader(
    cardClass = CardClass.Swordcraft,
    name = CardName.applyUnsafe("Quickblader"),
    cost = Cost.applyUnsafe(1),
    attack = Attack.applyUnsafe(1),
    health = FollowerHealth.applyUnsafe(1)
  )
}
