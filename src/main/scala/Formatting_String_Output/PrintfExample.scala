package Formatting_String_Output

object PrintfExample {
  def main(args:Array[String]): Unit={
    val name="Suryabhan"
    val marks=95.4582
    val Subject="Java"
    println("Name: %s | Marks: %.2f\n| Subject: %s", name,marks,Subject)
  }

}
