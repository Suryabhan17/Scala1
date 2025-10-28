package Parsing_a_Number_from_a_String

object Float {
  def main(args:Array[String]): Unit ={
    val str ="145.580"
    val num=str.toFloat
    println(s"String = $str and Number = $num")
  }

}
