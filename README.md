## Bootstrap for a containerised application

---

![Build](https://github.com/dpratt747/Scala_Docker_BootStrap/workflows/Build/badge.svg?branch=master&event=push)

The published build can be found [here](https://hub.docker.com/r/dpratt747/docker-scala-bootstrap)

* Dotty
* Docker
* Github Actions


For more information about the sbt Docker plugin please visit [here](https://www.scala-sbt.org/sbt-native-packager/formats/docker.html)

### Commands:
```zsh
sbt docker:publishLocal
```

```zsh
sbt docker:publish
```

```zsh
sbt release
```

```zsh
sbt "release with-defaults"
```