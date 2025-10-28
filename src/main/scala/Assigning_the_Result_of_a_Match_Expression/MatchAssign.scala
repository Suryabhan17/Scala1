package Assigning_the_Result_of_a_Match_Expression

object MatchAssign {
  def main(args : Array[String]) : Unit ={
    val day = "Sunday"

    val result =day match {
      case "Saturday" | "Sunday" => "Weekend"
      case _ => "Weekday"
    }
    println(s"$day is a $result")



    }


}

