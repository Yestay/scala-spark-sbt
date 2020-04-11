name := "spark2demo2"

version := "0.1"

scalaVersion := "2.11.12"
//libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.2.11"
resolvers += "Spark Packages Repo" at "http://dl.bintray.com/spark-packages/maven"
//resolvers += Resolver.bintrayIvyRepo("com.eed3si9n", "sbt-plugins")

//addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")
//libraryDependencies += "mrpowers" % "spark-daria" % "0.35.2-s_2.11"

libraryDependencies += "org.json4s" %% "json4s-native" % "3.6.7"
libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.6.7"
//libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.4" //% "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.4" % "provided"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
//libraryDependencies += "org.scala-lang" %% "scala-xml" % "2.11"
// https://mvnrepository.com/artifact/org.scala-lang.modules/scala-xml
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.2.0"

javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}