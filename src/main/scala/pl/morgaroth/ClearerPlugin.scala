package pl.morgaroth

import sbt._
import sbt.Keys._

object ClearerPlugin extends Plugin {

  override lazy val settings = Seq(commands += clearCommand)

  object ClearerKeys {
    val linesCount = SettingKey[Int]("Lines to input")

    lazy val settings: Seq[Setting[_]] = Seq(
      linesCount := 30
    )
  }

  def clearCommand() = Command.command("clearConsole", "Clear your console", "inerts new lines") {
    (state: State) => {
      val extracted = Project.extract(state)
      val lines = extracted get ClearerKeys.linesCount
      (1 to lines).foreach {
        _ => println()
      }
      state
    }
  }
}