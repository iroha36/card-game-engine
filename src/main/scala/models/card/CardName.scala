package models.card

import io.github.iltotore.iron.*
import io.github.iltotore.iron.constraint.all.*
import io.github.iltotore.iron.constraint.numeric.*

type CardName = String :| MaxLength[20]

object CardName extends RefinedTypeOps[String, MaxLength[20], CardName]