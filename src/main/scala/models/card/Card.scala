package models.card

import io.github.iltotore.iron.*
import io.github.iltotore.iron.constraint.numeric.*

trait Card(
            name: CardName,
            cardType: CardType,
            cost: Cost,
            abilities: Option[String]
          )



