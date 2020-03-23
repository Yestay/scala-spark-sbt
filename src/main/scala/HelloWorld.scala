//import org.json4s._
//import org.json4s.native.JsonMethods._
//import org.json4s.jackson.Serialization
//
//object HelloWorld {
//  case class Person(name: String, age: Int)
//  case class Wine(id: Int ,country:String)
//  def main(args: Array[String]): Unit = {
//    println("Hello  World")
//    implicit val formats = DefaultFormats
//
//
//
//    val s = """{"id":0,"country":"Italy"}"""
//    val json = pretty(render(Extraction.decompose(s)))
//    println(s"json:\n$json")
//
//    val decodedUser = parse(s).extract[Wine]
//    println(s"decoded user: $decodedUser")
//
//
//    val json2= """{"name":"joe","age":15}"""
//
//    val zz = parse(json2).extract[Person]
//    println(zz)
//
//  }
//}
