package com.ejemplo

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await
import java.util.concurrent.TimeUnit
import scala.concurrent.duration.Duration
import scala.concurrent.impl.Future
import scala.concurrent.impl.Future
import scala.concurrent.Future
import scala.util.Failure
import scala.util.Success

object Futuros extends App {

  def tareaDeLargaDuracion() : List[Int] = {
    Thread.sleep(1500)
    List(1,2,3)
  }
  
  val f: Future[List[Int]] = Future {
    tareaDeLargaDuracion
  }

  println(Await.result(f, Duration(2.0, TimeUnit.SECONDS)))
  
  f onComplete {
    case Success(list) => print(list)
    case Failure(e)    => println(e.getMessage)
  }
  
  Thread.sleep(3000)

}