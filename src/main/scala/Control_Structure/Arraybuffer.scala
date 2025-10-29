package Control_Structure
import scala.collection.mutable.ArrayBuffer

object Arraybuffer {
  def main(args: Array[String]) : Unit ={
    val buffer=ArrayBuffer(1,2,3,4,5)
    buffer +=4
    buffer -=3
    println(buffer)
  }

}
