package Matching_Multiple_Conditions

object MultiCase {
  def main(args: Array[String]): Unit = {
    val day = "Sunday"

    val result = day match {
      case "Saturday" | "Sunday" => "Weekend"
      case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Weekday"
      case _ => "Invalid day"
    }

    println(s"$day is a $result")
  }
}
