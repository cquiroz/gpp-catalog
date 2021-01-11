resolvers += Resolver.sonatypeRepo("public")

addSbtPlugin("edu.gemini"         % "sbt-lucuma"               % "0.3.3")
addSbtPlugin("com.geirsson"       % "sbt-ci-release"           % "1.5.5")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"              % "1.4.0")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")
addSbtPlugin("com.timushev.sbt"   % "sbt-updates"              % "0.5.1")
addSbtPlugin("org.scalameta"      % "sbt-scalafmt"             % "2.4.2")
addSbtPlugin("ch.epfl.scala"      % "sbt-scalajs-bundler"      % "0.20.0")
