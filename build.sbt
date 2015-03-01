name := "claps"

version := "1.0"

scalaVersion := "2.11.5"

// Declare `Specs2` dependencies.
libraryDependencies ++= Seq(
  "specs2-core",          // The core framework of `Specs2`.
  "specs2-matcher-extra", // For the optional `Specs2` matchers.
  "specs2-scalacheck",    // To use `ScalaCheck` properties in specifications.
  "specs2-mock",          // To use `Mockito` matchers.
  "specs2-analysis",      // To use the package dependencies matcher.
  "specs2-gwt",           // To write `given`/`when`/`then` specifications.
  "specs2-html",          // To export specifications as HTML.
  "specs2-form"           // To create HTML form-like specifications.
).map(dependencyName => "org.specs2" %% dependencyName % "3.0-M3" % "test")

// Add the Scalaz repository.
resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

scalacOptions in Test ++= Seq("-Yrangepos")
