package Matching_Multiple_Conditions

object MultiCase2 {
  def main(args : Array[String]) : Unit ={
    val s= 2
    val re = s match{
      case 1|9|6 => "Odd Number"
      case 2|4|8|6 => "even Number"
      case _ => "Out of rang"

    }
    println(s"$re")
    println(re)

  }

}
