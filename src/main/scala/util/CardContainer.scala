package util

import models.card.Card

import scala.util.Random

class CardContainer[T](cards: List[Card])(using c: ContainerOps[T]) extends IndexedSeq[Card]{
  override def apply(i: Int): Card = cards(i)

  override def length: Int = cards.size

  def shuffle(): T = c.apply(Random.shuffle(cards))
}

trait ContainerOps[T] {
  def apply(cards: List[Card]): T
}

object ContainerOps {
  def makeOps[T](constructor: List[Card] => T): ContainerOps[T] =
    (cards: List[Card]) => constructor(cards)
}
