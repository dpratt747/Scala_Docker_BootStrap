enablePlugins(UniversalPlugin)
enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)

lazy val root = project
  .in(file("."))
  .settings(
    name := ApplicationProperties.name,
    version := ApplicationProperties.version,
    scalaVersion := ApplicationProperties.scalaVersion,

    libraryDependencies ++= Dependencies.all
  )

packageName in Docker := ApplicationProperties.name
version in Docker := ApplicationProperties.version
maintainer in Docker := ApplicationProperties.org
dockerBaseImage in Docker := ApplicationProperties.jdkDockerImage
dockerUsername in Docker := Some(ApplicationProperties.org)
dockerUpdateLatest in Docker := true

