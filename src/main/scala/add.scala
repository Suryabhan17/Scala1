object add {
  def main(args : Array[String]): Unit ={
    val age =25
    val name="Suryabhan Singh"
    val a=
      """SURYAvha newebwe file update
        |My name is Suryabhan Singh
        | What is your village name
        |  My name is $name and age $age
        |""".stripMargin
        println(a)
        println(s"My name is ${name} and age ${age}")
    println("surya")
  }
}