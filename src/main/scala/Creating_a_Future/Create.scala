package Creating_a_Future



object Create {

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.util.{Success, Failure}
  def main(args: Array[String]): Unit = {
   /* val f = Future {
     // println("Runnig task in background...")
     // Thread.sleep(200)
      println("Calculating sum...")
      10 + 20
    }

    f.onComplete{
      case Success(value)=>println(s"Result : $value")
      case Failure(e) => println(s"Error : ${e.getMessage}")
    }
    println("This will print immediately")

    */

/*

    val futureSum = Future {
      println("Calculating sum...")
      50 + 70
    }

    futureSum.onComplete {
      case Success(result) => println(s"Sum is: $result")
      case Failure(error) => println(s"Error: ${error.getMessage}")
    }

    println("Main program continues...")

 */

    // Using map (Transformation Method)
    //Future ke result ko transform (change) karta hai.

   /* val f= Future{10+50}
    val d=f.map(x => x*2)
     println(d)
    d.onComplete{
      case Success(a) =>println(s"Double Result : $a")
      case Failure(e) => println(e)
    }

    */

    /* val f=Future {
      Thread.sleep(1000)
      30 +50
    }
    f.onComplete{
      case Success(v) => println(s"Success : $v")
      case Failure(e) => println(s"Error: ${e.getMessage}")
    }
    println("main program continues...")

     */

    // Handle Error

   /* val risky= Future {10/0}
    val safe=risky.recover {
      case _: ArithmeticException => 0
    }
    safe.onComplete{
      case Success(v) => println(s" Recover Value : $v")


    }

    */

   /* val numbers = List(1, 2, 3, 4, 5)

    val futures = numbers.map(n => Future {
      println(s"Processing $n")
      n * 2
    })

    val result = Future.sequence(futures)

    result.onComplete {
      case Success(values) => println(s"Results: $values")
      case Failure(e) => println(s"Error: ${e.getMessage}")
    }

    */

   /* val fast =Future { Thread.sleep(200);300}
    val slow=Future { Thread.sleep(1000); 200}
    val f= Future.firstCompletedOf(List(fast,slow))

    f.onComplete {
      case Success(v) => println(s"First completed value = $v")
    }

    */

    /*
    // Creating a future
   // import scala.concurrent.Future
val f = Future {
      println("Running task in background...")
      Thread.sleep(1000)
      10 +20
    }
    println("This will print immediately")

     */
    /*
   val f=Future{
     println("Calculating sum ....")

     50 + 40

   }
    f.onComplete{
      case Success(r) => println(s"Sum is : $r")
      case Failure(e) => println(s"Error : ${e.getMessage}")
    }
    println("Main program continues.....")

     */ /*
    // onComplete (Callback)
    val f=Future {
      Thread.sleep(1000)
      30+20
    }
    f.onComplete{
      case Success(r) => println(s"Success: $r")
      case Failure(e) => println(s"Error :${e.getMessage}")
    }
    println("Main program continues...")
    */

    /*
    // Map Use transform
    val f=Future {10 + 20}
    val d= f.map(x => x*2)
    println(d)
    d.onComplete{
      case Success (r) => println(s"Double Results : $r")
      case Failure(e) => println(s"New error $e")
    }

     */
/*
    // flatMap Use

    val f=Future { 10 }
    val d=f.flatMap(x => Future {x * x})

    d.onComplete {
      case Success(v) => println(s"Squared : $v")
    }
    println("Success")

 */

  /*
// match condition
    val f = Future {
      50
    }

    val filtered = f.filter(_ > 60)

    filtered.onComplete {
      case Success(v) => println(s"Valid: $v")
      case Failure(e) => println(s"Filtered Out: $e")
    }
   println("Success")

   */
/*
    // Recover and RecoverWith

    val r=Future {10 / 0}
    val s= r.recover {
      case _: ArithmeticException => 0
    }
    s.onComplete{
      case Success (d) => println(s"Recover Value: $d")

    }
    println("Run program")

 */
    /*
      // Method Running...
    def A(a: Int , b: Int ) : Future[Int] = Future {
      println("Calculating in background...")
      //Thread.sleep(1000)
      a + b
    }
    A(10,50).onComplete {
      case scala.util.Success(v) => println(s"Result : $v")
      case scala.util.Failure(e) => println(s"Error: ${e.getMessage}")

    }
    println("Main thread continues...")

     */
    /*
    def A(a:Int) : Future[Int]= Future {
      // Thread.sleep(500)
      a * 2
    }.map(result => result + 10)
    A(5).onComplete{
      case scala.util.Success(v) => println(s"Value is: $v")
    }
    println("Success")

     */

    /*
def getUser(): Future[String] = Future {
  "Suryabhan"
}

    def getGreeting(name: String): Future[String] = Future {
      s"Hello, $name!"
    }

    val finalMessage = getUser().flatMap(name => getGreeting(name))

    finalMessage.onComplete {
      case scala.util.Success(msg) => println(msg)
    }
    println("new")

     */
    /*
    val f= Future {
      println("Hello")
      // Thread.sleep(2000)
      10 + 50
    }
    println("World")

     */


    /*
    val f=Future {
      println("Hello")
      //Thread.sleep(20)
      10 + 50
    }
    f.onComplete {
      case Success(result) => println(s"Result : $result")
      case Failure(e) => println(s"Error : ${e.getMessage}")
    }
    println("World")

     */
     /*
    val f=Future {
      println("Calculating sum...")
      50 + 60
    }
    f.onComplete {
      case Success(r) => println(s"Sum is : $r")
      case Failure(e) => println(s"Error : ${e.getMessage}")
    }
    println("Main program continues.....")

      */
   /*
    val f=Future {10 + 50}
    val d=f.map(_ * 2)
    d.onComplete{
      case Success(r) => println(s"New Result on Map : $r")
      case Failure(e) => println(s"Error : ${e.getMessage}")

    }
    println("")

    */
      /*
    val f= Future {10}
    val c=f.flatMap(x => Future {x + x })
    c.onComplete{
      case Success(r) => println(s"Hello My World $r")
    }
    println()

       */
    /*
    def A(a : Int , b:Int ): Future[Int]=Future{
       println("Calculating in background")
       Thread.sleep(1000)
       a + b
     }
    A(10,50).onComplete{
      case scala.util.Success(value) => println(s"Result : $value ")
      case scala.util.Failure(e) => println(s"Error : ${e.getMessage}")
    }
    println("Main thread continue...")

     */

    def A(n: Int ): Future[Int]={
      Future {
       // Thread.sleep(500)
        n * 2
      }.map(x => x * 2)
    }
    A(5).onComplete{
      case scala.util.Success(r) => println(s"result : $r")
    }
    println()
  }
}







