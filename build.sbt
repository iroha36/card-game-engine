ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.6.2"

lazy val root = (project in file("."))
  .settings(
    name := "card-game-engine",
    libraryDependencies ++= Seq(
      "io.github.iltotore" %% "iron" % "2.6.0"
    )
  )
