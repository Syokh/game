name := "GameRockPaperScissors"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= {
  Seq(
    "org.scala-lang"            %  "scala-swing"           % "2.11.0-M7",
    "org.scalatest"             %%  "scalatest"            % "2.2.6"     % "test"
  )
}

fork in Test := true

javaOptions in test += "-Dconfig.file=test.conf"

assemblyJarName in assembly := "game_rock_paper_scissors.jar"

test in assembly := {}