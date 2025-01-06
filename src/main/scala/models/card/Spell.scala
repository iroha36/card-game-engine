package models.card

import io.github.iltotore.iron.constraint.numeric.{GreaterEqual, LessEqual}

class Spell(
                cardClass: CardClass,
                name: CardName,
                cost: Cost,
                abilities: Option[String] = None,
                final val cardType: CardType = CardType.Spell
              ) extends Card(name, cardType, cost, abilities) {
}
