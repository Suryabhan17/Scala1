package add1

import scala.collection.mutable.ListBuffer

object add {

 /* import scala.annotation.tailrec

  val set = Set(1, 2, 3)

  @tailrec
  def multiplyAll(s: Set[Int], acc: Set[Int]): Set[Int] = {
    if (s.isEmpty) acc
    else {
      val head = s.head
      multiplyAll(s.tail, acc + (head * 10))
    }
  }

  val result = multiplyAll(set, Set())
  println(result) // Set(10, 20, 30) */
/*
  @scala.annotation.tailrec
  def sumList[A](lst: List[A], acc: List[A] = Nil): List[A] =
    if (lst.isEmpty) acc else sumList(lst.tail,  lst.head :: acc)

  println(sumList(List(1, 2, 3, 4, 5)))
   */


@scala.annotation.tailrec
def countChar(s: String, acc: Int = 0): Int =
if (s.isEmpty) acc else countChar(s.tail, acc + 1)

  println(countChar("hello"))

  @scala.annotation.tailrec
  def revStr(s: String, acc: String = ""): String =
    if (s.isEmpty) acc else revStr(s.tail, s.head + acc)

  println(revStr("scala"))


  def main(args: Array[String]): Unit = {
  /*  val a =List (1, 2, 3, 4, 5, 6, 7)
  val b=a.filter(_>4)
   val c= for(n<-b) yield n+1

    println(c) */
    /*val name=List("Ram","Shyam","Mohan")
    val marks=List(85,89,95)
    val d=name ::: marks
    println(d)*/

   /* val a=List(1,2,3,4,5,6)
    val square= a.map(x => x*2)
    println(square) */


   /* val list=List(List(1,2,3,4,5,6), List(3,4))
    val result =list.flatMap(x => x)
    println(result) */

  /*  val a=List(1,2,3,4,5,6)
   val b= a.reduce (_ + _ )

    println(b) */

   /* val a= List("1","2","3","4","5","6")

    val b=a.groupBy(_.charAt(0))
    println(b) */

   /* val a=List(1,2,3,4)
    val b=List(5,6,7,8)
    val c=a.zip(b)
    println(c) */


   /* val a=List(1,2,3,4,4,2,1,2,3)
    val b=a.distinct
    println(b) */

    /* val a= List (2,4,6,8,10)
    val b=a.map(x => x*x)
    println(b) */

   /* val a= List(1,2,3,4,5,6,7,8,9,10)
    val b=a.reduce(_ + _)
    println(b) */
   /* val a=List("Surya","1","Ajeet","2","Manish","3","Vishal","4","Sangam","5","Deepak","6","Anshuman","7")
    val b=List("A","A","A","B","A","B","A")
    val c= a.groupBy(_.charAt(0))
    println(c) */

   /* val a=List(1,2,3,4,5,1,23,4,4,5,2)
     println(a.distinct)
    */

  /*  val a=List (1,2,3,4,5)
    a.foreach( println)
   */

   /* val a=Set(1,2,3,4,5)
    val b=a.map(_*10) */
   // println(b)
 // b.foreach(println)
 //  a.foreach(x=> println(x*10))


/*  val a=Map("1"->"2","2"->"3","3"->"4")
    a.foreach { case (b,c) => println(s"$b and $c") }
 */
  /*  val a=Map("Surya"->"A","Shyam"->"A","Vishal"->"A","Tinku"->"A")
    a.foreach{case (c ,b) => println(s"$c => $b")}
*/
   // val a= List(1,2,3,4,5,6,7)
   // val b= for (n <- a if n%2==0 ){
    //  println(s"$n is even number")
  //  }

   // a.foreach{n => if (n%2==0)
  //    println(s"$n is even")
  //  }

  //  val fruits = List("banana", "peach", "lime", "pear", "cherry")
  //  val newFruits=fruits.filter(f => f.length < 6 && f.startsWith("p"))
   //   .map(_.capitalize)
  //  println(newFruits)
 /* case class Student(name: String, marks: Int)

    val students = List(
      Student("Amit", 85),
      Student("Ravi", 92),
      Student("Sita", 78)
    )

    val sortedByMarks = students.sortBy(_.marks)
    println(sortedByMarks) */
   // val a=ListBuffer(1,2,3,4,4,5,5,4)
   // val b= List(1,2,3,4,5,6)
   // val c=b.updated(1,50)
  //  println(c)
    //val b=a.distinct
   // a.insert(0,20)


   // val c=a.filterNot(x=> x==3 || x==1 || x!=2)
    //println(a)
  //  println(b)
val a=List(1,2,3,4,5,6,7,8,9)
    val d=a.filter(_%2==0)
    val da=a.filter(_%2==1)
  val c=  a.map(x => x%2==0)
    println(d)
    println(da)

  //c.foreach(println)
  //  println(c)
     // println(c)
  }
}
