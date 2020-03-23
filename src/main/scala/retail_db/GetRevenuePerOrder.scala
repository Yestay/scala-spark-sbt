//package retail_db
//
//import org.apache.spark.sql.SparkSession
//
//
//object GetRevenuePerOrder {
//  def main(args: Array[String]): Unit = {
//    println("Hello  World")
//    //import spark.implicits._
//    val spark: SparkSession = {
//        SparkSession.builder().master("local").appName("spark session").getOrCreate()
//      }
//    val sc = spark.sparkContext
//    val path = "C:\\Users\\Yestay\\Documents\\data\\retail_db\\order_items"
//    val orderItems = sc.textFile(path) //"C:\\Users\\Yestay\\Desktop\\Otus\\winemag-data-130k-v2.json")//args(1))
//    print(orderItems.count())
//    val revenuePerOrder = orderItems.
//      map(oi => (oi.split(",")(1).toInt, oi.split(",")(4).toFloat)).
//      reduceByKey(_ + _).sortBy(oi => oi._1).
//      map(oi => oi._1 + "," + oi._2)
////
//    revenuePerOrder.saveAsTextFile("C:\\\\Users\\\\Yestay\\\\Desktop\\\\Otus\\\\output1.txt")//args(2))
//  }
//
//}