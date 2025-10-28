package Creating_Random_Strings

import scala.util.Random

object RandomStringExample2 {
  def main(args: Array[String]): Unit ={
val c="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    val l=10
    val randomStr=(1 to l)
      .map (_ => c(Random.nextInt(c.length)))
      .mkString
    println(s"Random String : $randomStr")
  }


}
