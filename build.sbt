// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

name := "typelevel-scala-js-demo"

version := "0.1.0"

//--------------------------
// Settings for the typelevel compiler
scalaOrganization := "org.typelevel"

scalaVersion := "2.12.2-bin-typelevel-4"

// This is needed to support the TLS compiler and scala.js at the same time
libraryDependencies ~= { (libDeps: Seq[ModuleID]) =>
  libDeps.filterNot(dep => dep.name == "scalajs-compiler")
}
//---------------------------

//---------------------------
// Settings for Lightbend compiler
// scalaVersion := "2.12.2"
//---------------------------

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
