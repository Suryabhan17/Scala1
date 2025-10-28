package NewCollation_yield_in_for

object ForYield {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5)

    val squares = for (n <- numbers) yield n * n

    println(squares)
  }
}
