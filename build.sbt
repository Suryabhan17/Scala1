ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.17"
scalaVersion := "3.3.1"

libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % "2.8.0"


lazy val root = (project in file("."))
  .settings(
    name := "untitled"

  )
