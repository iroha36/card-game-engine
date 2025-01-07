package models.leader

import io.github.iltotore.iron.:|
import io.github.iltotore.iron.constraint.numeric.{GreaterEqual, LessEqual}

import io.github.iltotore.iron.constraint.all.Positive
import io.github.iltotore.iron.constraint.numeric.{GreaterEqual, LessEqual}
import io.github.iltotore.iron.{:|, RefinedTypeOps}

enum EvolvePoint:
  case normalEvolve, superEvolve

// TODO pointsのサイズ（0 <= points.size <= 5）制約を実装する
case class EvolvePoints(points: List[EvolvePoint]) {
  def ++(other: EvolvePoints): EvolvePoints = EvolvePoints(points ++ other.points)
  
  def add(other: EvolvePoints): EvolvePoints = this ++ other
}

