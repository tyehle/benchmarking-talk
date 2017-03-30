name := "Pi"
version := "1.0"
scalaVersion := "2.12.1"

scalacOptions += "-opt:box-unbox"
scalacOptions += "-opt:inline-global"
scalacOptions += "-opt:closure-invocations"

mainClass in assembly := Some("PiRec")
assemblyJarName in assembly := "pi-rec.jar"
