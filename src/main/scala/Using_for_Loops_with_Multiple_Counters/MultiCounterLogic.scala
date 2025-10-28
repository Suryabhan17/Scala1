package Using_for_Loops_with_Multiple_Counters

object MultiCounterLogic {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j <- 1 to 3) {
      val sum = i + j
      println(s"$i + $j = $sum")
    }
  }
}
