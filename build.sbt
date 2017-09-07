name := """dealer-lead-overview"""
organization := "com.scout24"

//version := "1.0-SNAPSHOT"

version := Option(System.getenv("GO_PIPELINE_LABEL")).getOrElse("1.0-SNAPSHOT")

//lazy val root = (project in file(".")).enablePlugins(PlayScala)
lazy val root = project.in(file(".")).enablePlugins(PlayScala).disablePlugins(PlayFilters)

scalaVersion := "2.12.2"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0" % Test


// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.scout24.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.scout24.binders._"

fork := true // required for "sbt run" to pick up javaOptions

javaOptions += "-Dplay.editor=http://localhost:63342/api/file/?file=%s&line=%s"
