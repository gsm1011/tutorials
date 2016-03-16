
lazy val root = (project in file(".")).
    settings(
	name := "hello",
	version := "1.0-SNAPSHOT",
	organization := "monsanto",
	scalaVersion := "2.11.7"
)

// credentials += Credentials("Sonatype Nexus Repository Manager", "nexus.scala-tools.org", "admin", "admin123")
credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
// publishTo := Some("Sonatype Snapshots Nexus" at "http://localhost:8081/nexus/content/repositories/snapshots/")
publishTo := Some("Sonatype Snapshots Nexus" at "http://nexus-886161195.us-east-1.elb.amazonaws.com/nexus/content/repositories/snapshots/")
