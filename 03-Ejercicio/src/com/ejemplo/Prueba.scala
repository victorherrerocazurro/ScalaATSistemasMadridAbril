package com.ejemplo

object Prueba extends App {
  
  var pepe = new Persona("Pepe", 12)

  pepe.edad = 19

  var juan = new Cliente("Juan", 32, "Antiguo")

  juan modificarMiNumeroDeCuentaA "Nuevo"

  println(juan)

  //Como es de solo escritura no se puede leer
  //println(juan.numCuenta)

}