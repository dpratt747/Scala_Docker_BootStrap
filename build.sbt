import ReleaseTransformations._

releaseVersionBump := sbtrelease.Version.Bump.Next
releaseVersionFile := baseDirectory.value / "version.sbt"

publishConfiguration := publishConfiguration.value.withOverwrite(true)
releaseIgnoreUntrackedFiles := true

releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,              // : ReleaseStep
  inquireVersions,                        // : ReleaseStep
  runClean,                               // : ReleaseStep
  runTest,                                // : ReleaseStep
  setReleaseVersion,                      // : ReleaseStep
  releaseStepTask(publish in Docker),     // : ReleaseStep, publish the docker image in your specified repository(e.i. Nexus)
  setNextVersion,                         // : ReleaseStep
  commitNextVersion,                      // : ReleaseStep
  pushChanges                             // : ReleaseStep, also checks that an upstream branch is properly configured
)


lazy val root = project
  .in(file("."))
  .settings(
    name := ApplicationProperties.name,
    scalaVersion := ApplicationProperties.scalaVersion,
    libraryDependencies ++= Dependencies.all
  )
  .enablePlugins(UniversalPlugin, DockerPlugin, JavaAppPackaging)

packageName in Docker := name.value
version in Docker := version.value
maintainer in Docker := ApplicationProperties.org
dockerBaseImage in Docker := ApplicationProperties.jdkDockerImage
dockerUsername in Docker := Some(ApplicationProperties.dockerUsername)
dockerUpdateLatest in Docker := true

