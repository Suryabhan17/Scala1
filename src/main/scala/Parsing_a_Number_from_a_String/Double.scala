package Parsing_a_Number_from_a_String

object Double {
  def main(args: Array[String]): Unit ={
    val s="456.58"
    val num=s.toDouble
    val d="458.59"
    val num1=s.toDouble
    println(s"String=$d and Number=$num1")
    println(s"String = $s , Number=$num ")
  }

}
