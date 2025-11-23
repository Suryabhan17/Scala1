package main.scala.Creating_a_Future

import scala.annotation.tailrec
import scala.concurrent.blocking
import scala.concurrent.{Await, Future}
import scala.concurrent.duration
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Success, Failure}

object Question_future {

  def main(args: Array[String]): Unit = {

    /*
    val f =Future {
      println("Hello Future ")
      10 + 20
    }
    f.onComplete{
      case Success(r) => println(s"$r")
    }
    println("")

     */


    /*
      val f= Future {20 + 30}
    f.onComplete{
      case Success(v) => println(s"$v")
    }
    println("")

     */
    /*
    val f= Future {10}
    val f1=Future {20}
    val d= for{t<- f
               r <- f1}  yield t + r
    d.onComplete{
      case Success(v)=> println(s"$v")
    }
    println("")

   */

    /*
    val f = Future {
      println("Suryabhan Singh")
    }
    f.onComplete {
      case Success(r) => println(s"$f")
    }

 */

    /*
    val f=Future {

      println("Done")
      Thread.sleep(1000)

    }
    f.onComplete{
      case Success(v) => println(s"$v")
    }
    println("Start")

     */


    /*
    val d= Future {
      val a=10
      val b=0
      a/b
    }
    d.onComplete{
      case Success (r)=> println(s"Result : $r")
      case Failure (e) => println(s"Error : ${e.getMessage}")
    }
    println("")

     */
    /*
    val f=Future {10}
    val d=f.map(x=>x * 5)
    d.onComplete{
      case Success(r)=> println(s"Result $r")
      case Failure(e) => println(s"Error : ${e.getMessage}")
    }
    println()

   */
    /*
    val v=Future{10}
    val d=v.flatMap(x=> Future {x + 10})
    d.onComplete{
      case Success (r)=> println(s"Result $r")
      case Failure(e)=> println(s"Error : ${e.getMessage}")
    }
    println()

    */

    /*
    val a=List(1,2,3,4,5,6)
    val a1=Future {
       a.foreach(println)
    }
    println("Future started ....")

      */

    /*
    val a=Future {18}
    val d=a.filter(_%2==0)
    d.onComplete {
      case Success(r)=> println(s"Even number = $r")
      case Failure(e)=> println(s"Old NUmber: ${e.getMessage}")
    }
    println("Future Start..")

   */


    /*
    val a =Future {5}
    val b=Future {6}
    val d=a.zip(b)
    d.onComplete{
      case Success(r) => println(s"Result : $r")
      case Failure (e) => println((s"Error : ${e.getMessage}"))

    }
    println("Future Start ....")

     */
    /*
    val price=Future{5000}
    val tax=Future{500}
    val result=price.flatMap{price => tax.map{x=>x + price} }
    result.onComplete{
      case Success(r)=> println(s"Result $r")
      case Failure(e) => println(s"Error : ${e.getMessage}")
    }
    println("Future Start....")

    */

    /*

    import scala.concurrent.Future
    import scala.concurrent.ExecutionContext.Implicits.global
    import scala.util.{Success, Failure}

    // 1️⃣ Future: Pseudo file read
    val readFileFuture = Future {
      println("Reading file...")
      Thread.sleep(1000) // simulate delay
      "Hello Scala Future Programming" // pretend this is file content
    }

    // 2️⃣ Future: Process text (count words)
    def processText(text: String): Future[Int] = Future {
      println("Processing text...")
      Thread.sleep(500)
      text.split(" ").length // count how many words
    }

    // 3️⃣ Chain both using flatMap
    val chainedFuture = readFileFuture.flatMap(content => processText(content))

    // 4️⃣ Print result
    chainedFuture.onComplete {
      case Success(wordCount) =>
        println(s"Total words in file = $wordCount")

      case Failure(error) =>
        println(s"Error: ${error.getMessage}")
    }
     println()

     */
    /*
    val a=Future {
      println("Sum Of tow Number ")
       45  + 89
    }
    a.onComplete{
      case Success(r) => println(s"Result $r")
      case Failure(e) => println(s"Error : ${e.getMessage}")
    }
    println( " ")

    */

    /*
    val a=List(1,2,3,4,5,6,7)
    val d=Future {
      a.foreach(println)
    }
    d.onComplete{
      case Success(r) => println(s"Result : $r")
      case Failure(e) => println(s"Error : ${e.getMessage}")
    }
    println("Future Start...")

     */
    /*
    val a=Future{7}
    val d=a.map(x=> x * x)
    d.onComplete{
      case Success(r)=> println(s"Square : $r")
    }
    println("Future Starting .....")

     */

    /*
    val a=Future{45}
    val b=Future{5}
    val d=a.flatMap{x=>{b.map{y=> x / y }}}
    d.onComplete{
      case Success(r) => println(s"Divided = $r")
      case Failure(e) => println(s"Error : ${e.getMessage}")
    }

    println( )


     */


    /*
    val a=Future {
      println("Download started...")
      Thread.sleep(2000)
      "Download Complete : 5mb file"
    }
    a.onComplete{
      case Success(r) => println(s"Result : $r")
      case Failure(e) => println(s"Error : ${e.getMessage}")
    }
    println("Main thread continues...")

     */
    /*
    val a=Future { "Suryabhan Singh"}
    val d=a.map(_.toUpperCase)
    d.onComplete {
      case Success(r) => println(s"Result : $r")
      case Failure(e) => println(s"Error : ${e.getMessage}")
    }
    println("Main Future Starting...")

     */


    /*
       def A(n:Int ) : Int = {
      @tailrec
      def loop(x: Int, acc: Int, y: Int): Int =
        if (y == 0) x
        else loop(acc, x + acc, y - 1)
        loop(0, 1, n)

    }
      val fib=Future{
        A(10)
      }
    fib.onComplete{
      case Success(r)=> println(s"Result : $r")
    }
    println()

     */


    /*
    val heavyFuture=Future {
      println("Heavy computation started...")
      var sum =0l
      for(i <- 1 to 100000){
        sum = sum + i
      }
      println("Heavy computation finished.")
      sum
    }
    heavyFuture.onComplete{
      case Success(r)=> println(s"Sum of 1 to 1000000 = $r")
      case Failure(e) => println(s"Error : ${e.getMessage}")
    }
    println("Main thread running in parallel..")

     */

    /*
    import scala.concurrent.Future
    import scala.concurrent.ExecutionContext.Implicits.global
    import scala.util.{Success, Failure}

    val heavyFuture = Future {
      println("Heavy computation started...")

      var sum = 0L
      for (i <- 1 to 1000000) { // 1 million loop
        sum += i
      }

      println("Heavy computation finished.")
      sum
    }

    // Read result
    heavyFuture.onComplete {
      case Success(result) =>
        println(s"Sum of 1 to 1,000,000 = $result")

      case Failure(error) =>
        println(s"Error: ${error.getMessage}")
    }

    println("Main thread running in parallel...")



 */
    /*
    val a = List(1, 2, 3, 4, 5, 6, 7)
    val future = a.map(x => Future {
      println(s"Processing $x")
      x * 2
    })
      val result=Future.sequence(future)
    result.onComplete{
      case Success(r) => println(s"Result : $r")
      case Failure(e) => println(s"Error : ${e.getMessage}")

    }
   // println()
    */

     /*
    val a=Future{10/0}
    val b=a.recover {
      case _: ArithmeticException => -1

    }
    b.onComplete{
      case Success(r) => println(s"Recovered Value : $r") // -1
    }
    println()

      */

    /*
    val a=Future {"Suryabhan Singh"}
    val b=a.map(_.toUpperCase)
    b.onComplete {
      case Success(r) => println(s"Result : $r")
      case Failure(e) => println(s"Error : ${e.getMessage}")

    }
    println()

     */
    /*
    val a=Future {10/2}
    val d=a.transform(
      v => "success",
      e => new Exception("failure")
    )
    d.onComplete {
      case Success(t) => println(s"$t")
      case Failure(_) => println("failure")
    }
    println()

     */
    /*

    def geta():Future[Double]=Future {
      Thread.sleep(500)
      1000.0
    }
    def getb(a : Double): Future[Double] = Future {
      Thread.sleep(500)
      a * 0.18
    }
    def c(b:Double) : Future[Double]=Future {
      b-50
    }
         val h=geta().flatMap{a=>getb(a).flatMap{b => c(a + b)}}

       h.onComplete{
         case Success(r) => println(s"$r")
         case Failure(_) => println("Failure")
       }
    println()

  */
      /*
    // Future 1: get price
    def getPrice(): Future[Double] = Future {
      Thread.sleep(500)
      1000.0
    }

    // Future 2: calculate tax
    def getTax(price: Double): Future[Double] = Future {
      Thread.sleep(500)
      price * 0.18 // 18% tax
    }

    // Future 3: apply discount
    def applyDiscount(amount: Double): Future[Double] = Future {
      Thread.sleep(500)
      amount - 50 // flat discount
    }

    // Chaining with flatMap
    val finalAmount =
      getPrice().flatMap { price =>
        getTax(price).flatMap { tax =>
          applyDiscount(price + tax)
        }
      }

    // Print result
    finalAmount.onComplete {
      case Success(v) => println(s"Final amount to pay = ₹$v")
      case Failure(e) => println(s"Error: $e")
    }
println("")

       */


    /*
    val a=Future {
      println("Running main future....")
      10/0
    }
    val b=Future{
      println("Running backup future..")
      100
    }

    val r=a fallbackTo b
    r.onComplete{
      case Success(t)=> println(s"Final result = $t")
      case Failure(e) => println(s"Error : $e")
    }

   println()

     */
     /*
    def A(s:String) : Future[Int] = Future {
      s.length
    }
    A("Suryabhan").foreach(println)
    println()

      */


    /*
    val a= Future {"Suryabhan Singh and your name "}
    val b=a.map(_.length)
    b.onComplete{
      case Success(r)=> println(s"Length : $r")
      case Failure(e) => println(s"Error :${e.getMessage}")
    }
    println()

     */
     /*
    def Sum(s:List[Int]) :Future[Int]= Future {
      s.sum
    }
    Sum(List(1,2,3,4,5)).foreach(x=>println(x))
    println("Start Future ")

      */
   /*
    val f1= Future{10}
    val f2=Future {30}
    for {
      a <- f1
      b <- f2

    } println(a+b)
    println()

    */
     /*
    val a= Future(50)
    val b=Future(60)
    val c=Future(20)
     val total=for {
       f1<-a
       f2 <- b
       f3 <- c
     } yield f1 + f2 + f3

    total.onComplete{
      case Success(r)=>println(s"$r")
    }
    println()

      */


      /*
    val f1 = Future(50)
    val f2 = Future(30)
    val f3 = Future(20)

     for {
      a <- f1
      b <- f2
      c <- f3
    } println(a+b+c)

   println()

       */

    /*
      val f = Future { 10 }

    val chained = f.flatMap(x => Future { x * x })

    chained.onComplete {
      case Success(v) => println(s"Squared: $v")
    }
  println("Surya")

     */
      /*
    val a=List(1,2,3,4,5)
    val b= a.map(x => Future { x + 1})
    val d=Future.sequence(b)
    d.onComplete{
      case Success(r) => println(s"$r")
    }
    println(" Start Future")
   */



    /*
    val a= Future{ 50}
    val b=a.map(_ + 1)
    b.onComplete{
      case Success(r)=> println(r)
    }
    println("Start Future .....")

     */

    /*
       val f=55
       val a= Future {f}
      val b= a.flatMap(x=> Future{x*x})
      b.onComplete{
        case Success(r) =>  println(r)
      }
       println(" Start Future.....")

     */
     /*
    def sumList(num: List[Int]): Future[Int] = Future {
      num.sum
    }

    sumList(List(10,20,30,40)).foreach(println)


     println("Start Future ")


      */
    /*
    def A(s:List[List[Int]]): List[Int]={
      @tailrec
      def loop(x:List[List[Int]], acc: List[Int]=Nil): List[Int]={
        if(x.isEmpty) acc.reverse else loop(x.tail, x.head.reverse ::: acc)
      }
      loop(s)
    }
    println(A(List(List(1,2,3),List(4,5))))

     */
    /*
 def A(x: Int) : Future[Int]=Future{
       x + 2
     }.map(x=> x + 12)
    A(5).onComplete{
      case scala.util.Success(v)=> println(v)
    }
    println(" Start Future.....")

     */
    /*
    def A(a: Int, b: Int) : Future[Int]= Future{
      a +b
    }
    A(5,5).onComplete{
      case scala.util.Success(v) => println(v)
      case scala.util.Failure(e) => println(e)
    }
    println("Start Future.....")

     */
    /*
    def A(x:List[List[Int]]) : List[Int]={
      @tailrec
      def loop(d:List[List[Int]], acc: List[Int]=Nil): List[Int]={
        if (d.isEmpty) acc.reverse else loop(d.tail, d.head.reverse ::: acc)
      }
      loop(x)
    }
    println(A(List(List(1,2,3),List(4,5,6))))

     */
    /*
    val a= 1::2 ::3:: Nil
    println(a)

     */
  /*
    val a:Future[Int]=Future{
       println("Surya")
       10 + 50
     }
    a.onComplete{
      case Success(v) => println(s"v: ${v}")
      case Failure(e)=> println(e)
    }
   // println("Start Future...")


   */
   /*
     val a=List(1,2,34,4)
    val b=a.map(x=> Future(x + 1))
    val d= Future.sequence(b)
     d.onComplete{
       case Success(r)=> println(s"Result : $r")
     }
    d.foreach(println)
     println("Start Future....")



    */
    /*
     println(" ")
     val a=List(12,3,4,5)
    val b=Future.traverse(a){
      n => Future { n + 0}

    }

    b.foreach(println)
    print("Hello")

     */
/*
    object HelloActor:

    def apply(): Behavior.Receive[String] =
      Behaviors.receive { (ctx, msg) =>
        println(s"Received: $msg")
        Behaviors.same
      }

    @main def testAkka(): Unit =
    val system = ActorSystem(HelloActor(), "Hello")
    system ! "Hello Akka"



 */


    /*

    import akka.actor.typed.ActorSystem
    import akka.actor.typed.scaladsl.Behaviors

    object HelloActor
      def apply(): Behaviors.Receive[String] =
        Behaviors.receive { (ctx, msg) =>
          println(s"Received message: $msg")
          Behaviors.same
        }

    @main def testAkka(): Unit =
      val system = ActorSystem(HelloActor(), "HelloSystem")
      system ! "Hello Akka"


     */
class MyThread extends Thread {
      override def run() : Unit={
        for (i <- 1 to 5)
          println(i)
      }
    }
     def testThread () : Unit={
      val t=new MyThread()
      t.start()
    }

  }

}
