package Assigning_the_Result_of_a_Match_Expression

object MatchAssign2 {
  def main(args : Array[String]) : Unit={
     for(n<- 1 to 7 if n%2==0  ) {
      val b = n match {
        case 1 => "one"
        case 2 => "Two is even number"
        case 3 => "Three"
        case 4 => "Four is even number"
        case 5 => "Five"
        case 6 => "Six is even number"

      }
      println(s"$n is match in english word = $b")
    }


  }

}
