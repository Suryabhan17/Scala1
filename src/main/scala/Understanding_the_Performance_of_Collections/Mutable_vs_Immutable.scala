package Understanding_the_Performance_of_Collections

import scala.collection.mutable.ArrayBuffer
object Mutable_vs_Immutable {
  def main(args: Array[String]): Unit = {
    val buffer = ArrayBuffer[Int]()
    for (i <- 1 to 100000) buffer += 1

    //var list = List[Int]()
   // for (i <- 1 to 1000000) list = list :+ i
    println(buffer)
  //  println(list)
  }
}
