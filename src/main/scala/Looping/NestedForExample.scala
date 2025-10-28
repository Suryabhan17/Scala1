package Looping

object NestedForExample {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j <- 1 to 2) {
      println(s"i=$i, j=$j")
    }
  }

}
