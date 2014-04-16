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