package Control_Structure

object while_loop {
def main(args : Array[String]) : Unit ={
  val nums = List(1, 2, 3, 4)
  println(nums.head) // 1
  println(nums.tail) // List(2, 3, 4)

  val arr =Array(1,2,3,4,5)
  arr(2)=9
  println(arr.mkString(","))


}
}
