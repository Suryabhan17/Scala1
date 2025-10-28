package Parsing_a_Number_from_a_String

object StringToIntExample {
  def main(args : Array[String]) : Unit ={
    val a="1230"
    val b="451"
    val num= a.toInt
    val num1=b.toInt
    println(s"String = $b , Number = $num1")
    println(s"String : $a, Number : $num")
  }

}
