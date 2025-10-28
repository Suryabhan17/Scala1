object StringEquality {
  def main(args: Array[String]): Unit ={
    val str1="Surya"
    val str2="Surya"
    val str3=new String("Surya")
    println(str1 ==str2)
    println(str1== str3)
    println(str1==str2)
    println(str1.eq (str3))
  }

}
