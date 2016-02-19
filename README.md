# Spark Scala Cassandra Test

This is a simple program to test spark to cassandra integration.
It will attempt to make a connection to a cassandra instance and retrieve some data into spark.

<http://spark.apache.org/>

<https://github.com/datastax/spark-cassandra-connector>

## Online Documentation

You can find more on the spark-cassandra connector at the [spark-connector github page](https://github.com/datastax/spark-cassandra-connector).

## Pre-requistes

Make sure you have setup a spark instance and a cassandra instance.
The cassandra instance should have a keyspace "sample" and table "user". This also assumes no user/pass for cassandra connection.

CREATE KEYSPACE sample WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };

USE sample;

CREATE TABLE users (
firstname text,
lastname text,
age int,
email text,
city text,
PRIMARY KEY (lastname)); 

INSERT INTO users (firstname, lastname, age, email, city) VALUES ('John', 'Smith', 46, 'johnsmith@email.com', 'Sacramento');
 
INSERT INTO users (firstname, lastname, age, email, city) VALUES ('Jane', 'Doe', 36, 'janedoe@email.com', 'Beverly Hills');
 
INSERT INTO users (firstname, lastname, age, email, city) VALUES ('Rob', 'Byrne', 24, 'robbyrne@email.com', 'San Diego');

Also modify the SimpleApp.scala with the ip/hostname of your spark/cassandra instance.
i.e Change 'localhost'.

## Building the project

This project is built using sbt [Scala SBT](http://www.scala-sbt.org/documentation.html).
To build run:

    sbt package

## Submitting the program

To submit the program to Spark:

    ./bin/spark-submit --class "SimpleApp" --master spark://IP:PORT jar args

## Results

Look in the console for messages `count` and `first`.
For example:

    count = 100
	first = testuser

this means the program has completed successfully.
