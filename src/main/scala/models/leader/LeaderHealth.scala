package models.leader

import io.github.iltotore.iron.:|
import io.github.iltotore.iron.constraint.numeric.{GreaterEqual, LessEqual}

import io.github.iltotore.iron.constraint.all.Positive
import io.github.iltotore.iron.constraint.numeric.{GreaterEqual, LessEqual}
import io.github.iltotore.iron.{:|, RefinedTypeOps}

type LeaderHealth = Int :| GreaterEqual[0] | LessEqual[9999]

object LeaderHealth extends RefinedTypeOps[Int, GreaterEqual[0] | LessEqual[9999], LeaderHealth]