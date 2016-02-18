name := "SimpleProject"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
"org.apache.spark" %% "spark-core" % "1.1.0" % "provided",
"org.apache.hadoop" % "hadoop-client" % "2.4.0" % "provided",
("com.datastax.spark" %% "spark-cassandra-connector" % "1.1.0-rc1" withSources() withJavadoc()).exclude("commons-beanutils", "commons-beanutils-core").
    exclude("commons-collections", "commons-collections").exclude("commons-logging", "commons-logging").exclude("com.esotericsoftware.minlog", "minlog")
)


