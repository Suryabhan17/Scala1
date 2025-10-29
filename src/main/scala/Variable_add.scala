object Variable_add {
  def main(args :Array[String]): Unit ={
    val a=45
    val b=48
    val String1=
      s"""
        |Hello $a
        |Welcome to Scala version $b
        |Enjoy coding in multiline format.
        """.stripMargin
        println(String1)

   val s =  String1.replaceAll("\n"," ")
     // """This is known as a
      //  |"multiline" string
      //  |or 'heredoc' syntax.""".stripMargin.replaceAll("\n", ",")
      val upper = "hello, world".map(_.toUpper)
    //val upper1 = "hello, world".map(c.toUpper)
    println(upper)

   // println(s)
  }

}
