package models.card

import io.github.iltotore.iron.constraint.numeric.{GreaterEqual, LessEqual}

case class Follower(
                     name: CardName,
                     cardType: CardType,
                     cost: Cost,
                     attack: Option[Attack],
                     health: Option[FollowerHealth],
                     abilities: Option[String]
                   ) extends Card(name, CardType.Follower, cost, abilities)

object Follower:
  def create(
              name: String,
              cost: Int,
              attack: Int,
              health: Int,
              abilities: Option[String]
            ): Either[String, Follower] =
    for
      validName <- CardName.either(name)
      validCost <- Cost.either(cost)
      validAttack <- Attack.either(attack)
      validHealth <- FollowerHealth.either(health)
    yield Follower(validName, CardType.Follower, validCost, Some(validAttack), Some(validHealth), abilities)

