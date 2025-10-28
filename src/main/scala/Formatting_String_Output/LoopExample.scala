package Formatting_String_Output

object LoopExample {
  def main(args: Array[String]): Unit = {
    val word = "Hello"

    for (ch <- word) {
      println(ch) // print one by one word
    }
  }


}
