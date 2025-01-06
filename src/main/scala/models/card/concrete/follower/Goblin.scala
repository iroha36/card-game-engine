package models.card.concrete.follower

import models.card.*

case class Goblin(
                   cardClass: CardClass,
                   name: CardName,
                   cost: Cost,
                   attack: Attack,
                   health: FollowerHealth,
                 ) extends Follower(cardClass, name, cost, attack, health)

object Goblin {
  def apply(): Goblin = new Goblin(
    cardClass = CardClass.Neutral,
    name = CardName.applyUnsafe("Goblin"),
    cost = Cost.applyUnsafe(1),
    attack = Attack.applyUnsafe(1),
    health = FollowerHealth.applyUnsafe(2)
  )
}
