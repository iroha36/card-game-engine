package models.card

import io.github.iltotore.iron.*
import io.github.iltotore.iron.constraint.numeric.*
import io.github.iltotore.iron.*
import io.github.iltotore.iron.constraint.all.*

type Cost = Int :| GreaterEqual[0] | LessEqual[9999]

object Cost extends RefinedTypeOps[Int, GreaterEqual[0] | LessEqual[9999], Cost]