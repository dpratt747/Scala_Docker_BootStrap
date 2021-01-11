## Bootstrap for a containerised application

---

![Build](https://github.com/peaceiris/actions-gh-pages/workflows/Build/badge.svg?branch=master&event=push)

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
