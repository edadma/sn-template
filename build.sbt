name := "sn-template"

version := "0.0.1"

versionScheme := Some("early-semver")

scalaVersion := "3.7.2"

enablePlugins(ScalaNativePlugin)

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-language:postfixOps",
  "-language:implicitConversions",
  "-language:existentials",
)

organization := "io.github.edadma"

Global / onChangedBuildSource := ReloadOnSourceChanges

licenses := Seq("ISC" -> url("https://opensource.org/licenses/ISC"))

homepage := Some(url("https://github.com/edadma/" + name.value))

//libraryDependencies += "org.scalatest" %%% "scalatest" % "3.2.19" % "test"

//libraryDependencies ++= Seq(
//)

publishMavenStyle := true

Test / publishArtifact := false
