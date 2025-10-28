package Parsing_a_Number_from_a_String

object SafeOptionExample {
  def main(args: Array[String]): Unit ={
    val str1 ="123"
    val str2 ="12a"
    println(str1.toIntOption)
    println(str2.toIntOption)
  }

}
