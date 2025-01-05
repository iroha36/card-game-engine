package models.card

import io.github.iltotore.iron.:|
import io.github.iltotore.iron.constraint.numeric.{GreaterEqual, LessEqual}

import io.github.iltotore.iron.constraint.all.Positive
import io.github.iltotore.iron.constraint.numeric.{GreaterEqual, LessEqual}
import io.github.iltotore.iron.{:|, RefinedTypeOps}

type FollowerHealth = Int :| GreaterEqual[0] | LessEqual[9999]

object FollowerHealth extends RefinedTypeOps[Int, GreaterEqual[0] | LessEqual[9999], FollowerHealth]