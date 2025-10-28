package Creating_Random_Strings
import java.util.UUID
object UUIDExample {
  def main(args : Array[String]) : Unit={
    val r=UUID.randomUUID().toString
    println(s"Random UUID: $r")
  }

}
