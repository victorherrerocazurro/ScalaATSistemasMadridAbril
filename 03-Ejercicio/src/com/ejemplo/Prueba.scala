package com.ejemplo

object Prueba extends App {
  
  var pepe = new Persona("Pepe", 12)

  /*pepe.edad= 19
  pepe.edad_=(19)*/
  
  println(pepe.edad)

  var juan = new Cliente("Juan", pepe.edad, "Antiguo")

  juan modificarMiNumeroDeCuentaA "Nuevo"

  println(juan)

  //Como es de solo escritura no se puede leer
  //println(juan.numCuenta)

}