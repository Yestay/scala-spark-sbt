name := "spark2demo2"

version := "0.1"

scalaVersion := "2.11.12"

resolvers += "Spark Packages Repo" at "http://dl.bintray.com/spark-packages/maven"
resolvers += Resolver.bintrayIvyRepo("com.eed3si9n", "sbt-plugins")

//addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")

libraryDependencies += "org.json4s" %% "json4s-native" % "3.6.7"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.5" //% "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.5" //% "provided"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
//libraryDependencies += "org.scala-lang" %% "scala-xml" % "2.11"
// https://mvnrepository.com/artifact/org.scala-lang.modules/scala-xml
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.2.0"

javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")