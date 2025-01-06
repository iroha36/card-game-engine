package util

import models.card.Card

import scala.util.Random

class CardContainer[T](cards: List[Card])(using c: ContainerOps[T]) extends Iterable[Card]{
  override def iterator: Iterator[Card] = cards.iterator

  def shuffle: T = c.apply(Random.shuffle(cards))
}

trait ContainerOps[T] {
  def apply(cards: List[Card]): T
}
