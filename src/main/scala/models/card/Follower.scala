package models.card

import io.github.iltotore.iron.constraint.numeric.{GreaterEqual, LessEqual}

class Follower(
                cardClass: CardClass,
                name: CardName,
                cost: Cost,
                attack: Attack,
                health: FollowerHealth,
                abilities: Option[String] = None,
                final val cardType: CardType = CardType.Follower
              ) extends Card(name, cardType, cost, abilities) {
}
