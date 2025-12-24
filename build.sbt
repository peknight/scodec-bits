import com.peknight.build.gav.*
import com.peknight.build.sbt.*

commonSettings

lazy val scodecBits = (project in file("."))
  .settings(name := "scodec-bits")
  .aggregate(
    scodecBitsCore.jvm,
    scodecBitsCore.js,
    scodecBitsCore.native,
  )

lazy val scodecBitsCore = (crossProject(JVMPlatform, JSPlatform, NativePlatform) in file("scodec-bits-core"))
  .settings(name := "scodec-bits-core")
  .settings(crossDependencies(scodec.bits))

