import xerial.sbt.Sonatype.SonatypeKeys._

sonatypeSettings

profileName := "morgaroth"

sbtPlugin := true

name := "sbt-clearer"

organization := "pl.morgaroth"

version := "0.1.0"

publishMavenStyle := true

pomExtra := <url>https://github.com/Morgaroth/sbt-clearer</url>
  <licenses>
    <license>
      <name>Apache License, Version 2.0</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:Morgaroth/sbt-clearer.git</url>
    <connection>scm:git:git@github.com:Morgaroth/sbt-clearer.git</connection>
  </scm>
  <developers>
    <developer>
      <id>morgaroth</id>
      <name>Mateusz Jaje</name>
    </developer>
  </developers>

//libraryDependencies += "net.databinder.dispatch" %% "dispatch-core" % "0.11.1"

libraryDependencies += "net.databinder" %% "dispatch-core" % "0.8.10"

crossScalaVersions := Seq("2.9.2")

crossBuildingSettings

sbtVersion in sbtPlugin := "0.12"