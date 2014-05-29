package pl.morgaroth

import sbt._
import sbt.Keys._

object ClearerPlugin extends Plugin {

  override lazy val settings = Seq(commands += clearCommand)

  def clearCommand() = Command.command("clearConsole", "Clear your console", "inerts 30 new lines") {
    (state: State) => {
      (1 to 30).foreach {
        _ => println()
      }
      state
    }
  }
}