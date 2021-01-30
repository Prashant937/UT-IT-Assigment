name := "UT-IT-Group1"

version := "1.0"

scalaVersion := "2.12.12"

lazy val ques1andques2 = project.in(file("ques1andques2"))
  .settings(libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test)

lazy val ques3 = project.in(file("ques3"))
  .settings(libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test, "org.mockito" %% "mockito-scala" % "1.16.15" % Test))



