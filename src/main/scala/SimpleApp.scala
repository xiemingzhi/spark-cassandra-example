import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import com.datastax.spark.connector._

object SimpleApp {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("Simple Application With Cassandra").set("spark.cassandra.connection.host", "192.168.1.84")
    val sc = new SparkContext("spark://192.168.1.84:7077", "sample", conf)
    val rdd = sc.cassandraTable("sample", "user")
    println(rdd.count)
    println(rdd.first)
  }
}
