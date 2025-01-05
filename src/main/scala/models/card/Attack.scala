package models.card

import io.github.iltotore.iron.constraint.numeric.{GreaterEqual, LessEqual}
import io.github.iltotore.iron.{:|, RefinedTypeOps}

type Attack = Int :| GreaterEqual[0] | LessEqual[9999]

object Attack extends RefinedTypeOps[Int, GreaterEqual[0] | LessEqual[9999], Attack]