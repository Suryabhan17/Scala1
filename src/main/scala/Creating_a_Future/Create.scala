package Creating_a_Future

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Success , Failure}

object Create {
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

    val fast =Future { Thread.sleep(200);300}
    val slow=Future { Thread.sleep(1000); 200}
    val f= Future.firstCompletedOf(List(fast,slow))

    f.onComplete {
      case Success(v) => println(s"First completed value = $v")
    }


  }
}
