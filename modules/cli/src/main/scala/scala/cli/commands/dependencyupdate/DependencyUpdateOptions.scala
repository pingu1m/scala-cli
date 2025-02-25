package scala.cli.commands.dependencyupdate

import caseapp.*
import caseapp.core.help.Help

import scala.cli.commands.shared.{HasSharedOptions, SharedOptions}

// format: off
@HelpMessage("Update dependencies in project")
final case class DependencyUpdateOptions(
  @Recurse
    shared: SharedOptions = SharedOptions(),
  @Group("DependencyUpdate")
  @HelpMessage("Update all dependencies if newer version was released")
    all: Boolean = false,
) extends HasSharedOptions
  // format: on

object DependencyUpdateOptions {
  implicit lazy val parser: Parser[DependencyUpdateOptions] = Parser.derive
  implicit lazy val help: Help[DependencyUpdateOptions]     = Help.derive
}
