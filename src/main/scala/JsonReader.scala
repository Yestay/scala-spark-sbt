import org.apache.spark.sql.SparkSession

import org.json4s.native.JsonMethods._
import org.json4s.DefaultFormats

object JsonReader extends App {

  case class Wine(id: Option[Int] ,country:Option[String] = None,points:Option[Int], price: Option[Double] , title:Option[String], variety:Option[String],winery:Option[String])


    implicit val formats = DefaultFormats

    val spark: SparkSession = {
      SparkSession.builder().master("local").appName("JsonReader_K").getOrCreate()
    }

    val sc = spark.sparkContext
    sc.setLogLevel("ERROR")
    val lines = sc.textFile(args(0))
    val j_lines = lines.map(item => parse(item).extract[Wine])
    j_lines.foreach(i => println(i))
  sc.stop()
  spark.stop()


}
