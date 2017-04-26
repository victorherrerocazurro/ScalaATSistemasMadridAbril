package com.ejemplo

object Closures extends App {
  //Se define una variable
  var hello = "Hello"

  //Se define un metodo, que usa la anterior variable
  def sayHello(name: String) { 
    println(s"$hello, $name") 
  }

  // Se crea un objeto con un método que acepta un Closure
  val foo = new otherscope.Foo

  //Se ejecuta el método, pasando el metodo definido anteriormente 
  //como Closure
  foo.exec(sayHello, "Al")

  //Se cambia la variable
  hello = "Hola"

  //Se ejecuta de nuevo el metodo con la misma closure
  foo.exec(sayHello, "Al")
}

package otherscope {
  class Foo {
    def exec(f: (String) => Unit, name: String) {
      //ejecutando SayHello
      f(name)
    }
  }
}