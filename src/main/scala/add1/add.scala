package add1

import javax.sound.midi.Receiver
import scala.annotation.tailrec
import scala.collection.mutable
import scala.concurrent.Future
import scala.collection.mutable.ListBuffer
import scala.concurrent.{ExecutionContext, Future}
import ExecutionContext.Implicits.global
import scala.util.Success
import scala.util.Failure
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.Await
//import akka.actor.typed.ActorSystem
//import akka.actor.typed.scaladsl.Behaviors


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

/*
@scala.annotation.tailrec
def countChar(s: String, acc: Int = 0): Int =
if (s.isEmpty) acc else countChar(s.tail, acc + 1)

  println(countChar("hello"))

  @scala.annotation.tailrec
  def revStr(s: String, acc: String = ""): String =
    if (s.isEmpty) acc else revStr(s.tail, s.head + acc)

  println(revStr("scala")) */


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

  //  val c=a.filterNot(x=>  x==3 )
  // val c=a.filterNot(x=> x==3 || x==1 || x!=4)
    //println(a)
  //  println(b)
   // println(c)
 // val a=List(1,2,3,4,5,6,7,8,9)
 //   val c=  a.map(x => x%2==0)
  //  println(c)
/*val a=List(1,2,3,4,5,6,7,8,9)
    val d=a.filter(_%2==0)
    val da=a.filter(_%2==1)
  val c=  a.map(x => x%2==0)
    println(d)
    println(da)


    val as=List(1,2,3,4)
    val a3=new StringBuilder
     val p=as.addString(a3)
    println(p)
    val (a1 , a2)=as.partition(_>2)
    println(a1)
    println(a2)
   // val ca=as.sliding(2).toList
   // val df=as.grouped(2).toList
   // println(df)
   // println(ca)
   // val t=as.splitAt(2)

   // println(t)
   // val f=as.mkString("")
   // println((f))

  //c.foreach(println)
  //  println(c)
     // println(c)

   /* val student =Map("Amit"->85,"Surya"->95,"Tinku"->98)
    for ((a,b)<-student){
      println(s"Name $a and Score $b")
    }
    println()
    student.foreach{case (a,b) => println(s"Name=$a and Score=$b")} */
    import scala.concurrent.Future
    import scala.concurrent.ExecutionContext.Implicits.global
    import scala.util.{Success, Failure}

    val f = Future {
      Thread.sleep(1000)
      30 + 20
    }

    f.onComplete {
      case Success(value) => println(s"Success: $value")
      case Failure(ex) => println(s"Error: ${ex.getMessage}")
    }

    println("Main program continues...")

 */
  /*  val a=List(1,2,3,4,5,6)
  val ad=a.foldRight(2)(_+_)
    val(d,c)=a.splitAt(3)
    val as=a.grouped(2).toList
    val ab=a.sliding(5).toList
    println(ad)
    println()
    for((num,index )<-a.zipWithIndex){
      println(s"Index=$index and Number=$num")
    }
    println()
    a.iterator.foreach(println)
    println()
    println("sliding : "+ab)
    println()
    println("grouped : "+as)
    println()
    println(d)
    println(c)

   */
      /*
    val a=List(1,2,3,4,5,5)
         val b= a.take(3)
       val d=  a.drop(3)
    println(d)
    println(b)

       */
         //  val b=a.toString()
      // println(s"${b+1}  add one element in this number ")
     // val v=a.iterator
     // val f=v.sum
     //  println(f)

      /* val b=a.map(_+1)
       val c=for(n<-a ) yield n+1
        a.foreach(x => println(x+1))
      val d=a.filter(x => x % 2==0)
      println(d)

       */

    /*
      val a = Map("India" -> "Delhi", "France" -> "Paris", "Japan" -> "Tokyo")
       val g= a.map { case (s , b) => (s, b+2)}
        println(s"Capital of $g")


     */












   /* val a=Map("surya"->"1","surya1"->"2", "village"->"jhanga")
         //val b=a.values
 val c=a.filter{case (f, b) => b >=  "1" }
      // println(d)
    println(c)
  val d= a.filter(x => x ._2 > "1")
    println(d) */



     // println(b)


    // val a=Map("Math"->1,"Vishal"->5,"Village"->3)
   // val b=a.map{ case (d,n)=>(d,n+1)}
    // println(b)

   // println(a("Vishal"))
   // for ((d,b)<- a)
    //  println(s"$d and $b")
   // println(a.get("Math"))
   //
    // println((a.contains("surya")))
   /*
    val d=a.filter(_._2 > 3)
    println(d)
    val d1=a.filter{ case (v,k)=> k>2}
    println(d1)

    val products = Map("Pen" -> 10, "Book" -> 50, "Bag" -> 200)

    val expensive = products.filter { case (item, price) => price > 40 }

    println(expensive)

    */
  /*
    val a=List(1,1,1,1,1,1)
         val b=a.toIterator
           val c=b.sum
    println(c)

   */
    /*
    val a=Map("surya"->45,"Vishal"->85,"Tinku"->89)
   // println(a("Tinku"))
    val c= a.filter{ case (d,b)=> b > 58}
    println(c)

     */
   /*
    val nums = List(1, 1, 2, 3, 4, 5)
    val result = nums.take(3)
    println(result)
      val d=nums.toIterable
         val f=d.max
        println(f)

    */
   /*
    val a=List(1,2,3,4,5,5,6)
    //val d=a.toIterable
    val g=a.sum
    val f=a.reduce(_ + _)
    println("Sum =" + g)
    val d1= a.reverse
    println("Reverse =" + d1)

    println("Reduce =" + f)

    */

    /*
    val a=List(1,2,3,4,5)
       val b= a.map(_ + 1)
    println(b)


     */
 /*
    val a=Map("Surya"-> 45, "Surya1"->89,"Surya2"->89)
      a.map{case(d1,d2)=> println(s"Name=$d1 is roll no:$d2")}
    println()
    val b= a.map{case ( d,f)=>(d,f)}
    println(b)
       println(a)

  */
   // val a=List(1,2,3,4,5,6) // k=2,3
     /*
    def A(n:List[Int], e:Int):Int={
      @tailrec
      def loop(x:List[Int],acc: Int=0):Int={
        if(x.isEmpty) acc else loop(x.tail, if(x.head==e)x.head+acc else acc)
      }
      loop(n)
    }
    println(A(List(1,2,3,4,5),3))

      */
    /*
    def A(n:List[Int]):List[Int]={
      @tailrec
      def loop(x:List[Int], acc:List[Int]=Nil): List[Int]={
       // if(x.isEmpty) acc else loop(x.tail, if (x.head > acc.head ) x.head ::acc else acc)
        if(x.isEmpty) acc
        else if(x.head > acc.head)
          loop(x.tail, x.head :: acc)
        else
          loop(x.tail, acc)
      }
      loop(n)
    }
    println(A(List(23,4,3,67,34)))

     */
/*
    val a=List(1,2,3,4,5)
      val d=a.fold(5)(_ + _)
    println(d)

 */
    /*
    val a =List("A","B","C","D")
     val d=a.groupBy( _.charAt(0))
    println(d)

     */
    /*
    val a=List(List(1,2,3,4),List(3,4,5,6))
    val d=a.flatten
    val f=a.flatMap(x => x.map(y=> y + 1))
    println(f)
    println("New")
      println(d)

     */
    /*
    val a=List(1,2,3,4)
    val b=List("a","b","d")
     val d=for(f <- a ) yield f :: b
    val t=for(g <- b) yield g :: a
    println(d)
    println()
    println(t)
    //val d=a.zip(b)
    //println(d)


     */
    /*
    def Result () : Unit={
      val t=new Thread(()=>{
        println("Suryabhan Singh")
        val a=for(i<- 1 to 10) yield i * i
        val c=a.filter(_%4==0)
        val d=a.filter(_%4==1)
        println(s"Square Root Number 1 to 10 : $a")
        println(s"Divided 4 : $c")
        println(s"Not Divided 4 : $d")


      })
      t.start()

    }
    Result()

     */


       /*
    def Result() : Unit ={
      val t=new Thread (()=>{
        Thread.sleep(2000)
        println("child done")
      })
      t.start()
      t.join()
      println("main after join")
    }
    Result()

        */

    /*
  var x=0
    def Result(): Unit={
      val a=new Thread(()=>for(_ <- 1 to 1000) x += 1)
      val b=new Thread(()=> for (_ <- 1 to 1000 ) x +=1)
      a.start() ; b.start()
      a.join() ; b.join()
      println(x)

    }
Result()

     */
/*
     var x=0
    val lock =new Object
    def g(): Unit =lock.synchronized{ x += 1}
    def Result() : Unit ={
      val t1=new Thread(()=> for(_ <- 1 to 1000) g ())
      val t2=new Thread(()=> for(_ <- 1 to 1000)g())
      t1.start(); t1.join()
      t2.start(); t2.join()
      println()

    }


 */
   /*
    val a= Future {20}
    val b= a andThen{
      case Success(v)=> println(v)
      case Failure(e)=> println(e)
    }
    println("Start")

    */
    /*
    val a=Future{12}
    val b=Future{45}
    val c=for {
      d<-a
      f<-b
    } yield d + f
    c.foreach(println)
    println(" surya")


     */
    /*
     val a: List[Future[List[Future[List[Int]]]]] =
      List(
        Future.successful(
          List(
            Future.successful(List(1, 2, 3)),
            Future.successful(List(4, 5))
          )
        ),
        Future.successful(
          List(
            Future.successful(List(6)),
            Future.successful(List(7, 8))
          )
        )
      )
     val b=Future.sequence(a)


   // val c=b.map(_ + 1)
   // c.foreach(println)

     */
    /*
    val a=Future[Int]{50}
    a.onComplete{
      case Success(r)=> println(r)
      case Failure(e)=> println(s"${e.getMessage}")
    }
    println("Start")

     */
/*
   def Result()  ={
     val f=Future{
       Thread.sleep(500)
       10 + 50
     }
     val a=Await.result(f, 1.second)
     println(a)
   }
   Result()


 */
    /*

    def demo() ={
      val f=Future {
        Thread.sleep(500)
        50 + 60
      }
      val a=Await.ready(f,2.second)
      println(a)
    }
    demo()

     */
     /*
    class hello extends Actor {
      def receiver : Receiver ={
        case "hello"=> println("Surya")
        case msg => println(msg)
      }

      */
    /*
    def demo() ={
      val f=Future {
        Thread.sleep(500)
        50 + 60
      }
      val a=Await.result(f,1.second)
      println(a)
    }
    demo()

     */
    /*
    val a=Future {
      Future{2}
    }
    val d=a.flatten
    d.onComplete{
      case Success(r)=> println(r)
      case Failure(e)=> println(e)
    }
    println("Starting.....")


     */
    /*
    val a=Future{5}
      val d=a.andThen {
        case Success(v)=>println(v)
        case Failure(e)=>println(e)
      }
    d.foreach(println)
    println("Start")

     */
    /*

    val a=Future {50}
    val b=Future{60}
    val c=Future{40}
    val d=for {
      i <- a
      j <- b
      k <- c

    } yield(i + j + k)
    d.map(println)
    println("Staring")
    //println(d)



    //}


     */
    val a =45
    val b =45
  val c= for (i <- List(a) ; j <- List(b) ) yield (i + j)

    println(c)
  }




}
