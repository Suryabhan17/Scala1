package Using_for_Loops_with_Multiple_Counters

object MultiCounterYield {
  def main(args: Array[String]): Unit = {
    val pairs = for (i <- 1 to 3; j <- 1 to 3) yield (i, j)
    println(pairs)
  }

}
