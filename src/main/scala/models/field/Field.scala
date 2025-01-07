package models.field

import models.card.Card
import models.card.concrete.follower.{Goblin, WaterFairy}
import models.card.concrete.spell.FairyCircle
import util.{CardContainer, ContainerOps}

import scala.util.Random

case class Field(cards: List[Card]) extends CardContainer[Field](cards)

object Field:
  given ContainerOps[Field] = ContainerOps.makeOps(Field.apply)

  lazy val initialField: Field = Field(Nil)

