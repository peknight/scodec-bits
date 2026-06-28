import com.peknight.build.gav
import com.peknight.build.gav.*
import com.peknight.build.sbt.*

commonSettings

lazy val scodecBits = (project in file("."))
  .settings(name := "scodec-bits")
  .aggregate(scodecBitsCore.projectRefs *)

lazy val scodecBitsCore = (projectMatrix in file("scodec-bits-core"))
  .settings(name := "scodec-bits-core")
  .settings(libraryDependencies ++= dependencies(scodec.bits))
  .jvmPlatform(scalaVersions = Seq(scala.scala3.version))
  .jsPlatform(scalaVersions = Seq(scala.scala3.version))
  .nativePlatform(scalaVersions = Seq(scala.scala3.version))
