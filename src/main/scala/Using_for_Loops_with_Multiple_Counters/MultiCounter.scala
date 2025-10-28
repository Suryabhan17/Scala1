package Using_for_Loops_with_Multiple_Counters

object MultiCounter {
  def main (args: Array[String]): Unit
  =
  {
    for (i <- 1 to 3; j <- 1 to 2) {
      println(s"i = $i, j = $j")
    }
  }


}
