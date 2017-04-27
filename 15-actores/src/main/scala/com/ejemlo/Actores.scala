package com.ejemlo

import scala.concurrent.ExecutionContext.Implicits.global
import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import java.util.concurrent.TimeUnit
import akka.util.Timeout
import akka.pattern.ask
import scala.util.Failure
import scala.util.Success
import akka.actor.ActorRef

object Actores extends App {
  val system = ActorSystem("HelloSystem")

  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")

  //Llamada sin esperar resuesta
  helloActor.!("hello")(helloActor)

  implicit val timeout = Timeout.apply(2, TimeUnit.SECONDS)
  val future = ask(helloActor, "que tal?")
  //Llamada esperando respuesta
  future onComplete {
    case Success(mensaje) => println(mensaje)
    case Failure(e)       => println(e.getMessage)
  }

  helloActor ! "buenos dias"

}

class HelloActor extends Actor {
  def receive = {
    case "hello"    => println("hello back at you") ; println(sender)
    case "que tal?" =>
      println("hello back at you"); sender ! "Muy bien" ; println(sender)
    case _ => {
      println("huh?")

      /*var actor : ActorRef = this.context.system.actorOf(Props[HelloActor])

      actor.!("")*/

      //this.context.system.terminate()
    }
  }
}