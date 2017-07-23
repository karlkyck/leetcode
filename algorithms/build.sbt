name := "leetcode-algorithms-scala"
version := "1.0"
scalaVersion := "2.12.2"

val ScalaTestVersion = "3.0.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % ScalaTestVersion % Test
)
