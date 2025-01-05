package models.card

import io.github.iltotore.iron.constraint.numeric.{GreaterEqual, LessEqual}

case class Follower(
                     name: CardName,
                     cardType: CardType,
                     cost: Cost,
                     attack: Attack,
                     health: FollowerHealth,
                     abilities: Option[String]
                   ) extends Card(name, CardType.Follower, cost, abilities)

object Follower:
  def unsafeCreate(
                    safeName: String,
                    safeCost: Int,
                    safeAttack: Int,
                    safeHealth: Int,
                    safeAbilities: Option[String]
                  ): Follower =
    val name = CardName.applyUnsafe(safeName)
    val cost = Cost.applyUnsafe(safeAttack)
    val attack = Attack.applyUnsafe(safeHealth)
    val health = FollowerHealth.applyUnsafe(safeHealth)
    Follower(name, CardType.Follower, cost, attack, health, safeAbilities)

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
    yield Follower(validName, CardType.Follower, validCost, validAttack, validHealth, abilities)

