package Using_for_Loops_with_Multiple_Counters

object MultiCounterExample2 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5; j <- 1 to 5 if i == j) {
      println(s"i and j are same: $i")
    }
  }
}
