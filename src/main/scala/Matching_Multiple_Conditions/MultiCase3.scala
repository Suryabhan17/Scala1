package Matching_Multiple_Conditions

object MultiCase3 {
  def main(args: Array[String]): Unit = {
    val input : Any = 10

    val result = input match {
      case 10 | 45.8 => "Numeric type"
      case x: String => "String type"
      case _ => "Unknown type"
    }
    println(result)
  }
}
