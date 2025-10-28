package Assigning_the_Result_of_a_Match_Expression

object MatchAssign3  {

    def main(args: Array[String]): Unit = {
      val a = 10
      val b = 5
      val d = "+"

      val r = d match {
        case "+" => a + b
        case "-" => a - b
        case "*" => a * b
        case "%" => a % b

      }
      println(r)
    }




}
