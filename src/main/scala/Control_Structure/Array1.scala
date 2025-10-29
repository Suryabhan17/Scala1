package Control_Structure

object Array1 {
  def main(args : Array[String]): Unit ={
    val arr =Array(1,2,3,4,5)
    arr(1)=9
    println(arr.mkString(","))
  }

}
