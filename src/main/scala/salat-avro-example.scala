import models._
import com.novus.salat._
import com.novus.salat.annotations._
import com.novus.salat.global._

object Main extends Application {
  val greeting = "Hello World!" 
    Console.println(greeting) 

  val a = Record(greeting)
    Console.println(a)

  val dbo = grater[Record].asDBObject(a)
    Console.println(dbo)

}


