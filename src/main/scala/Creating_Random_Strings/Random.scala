package Creating_Random_Strings
import scala.util.Random
object Random {
  def main(args: Array[String]): Unit={
    val random=new Random()
    val length=9
    val randomString=(1 to length)
      .map(_ =>(random.nextInt(26)+65).toChar)
      .mkString("")
     println(s"Random String : $randomString")
  }


}
