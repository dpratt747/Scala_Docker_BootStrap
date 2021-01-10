import sbt._

import scala.collection.immutable

object Dependencies {
  lazy val all: immutable.Seq[ModuleID] = List.empty[sbt.librarymanagement.ModuleID]
}
