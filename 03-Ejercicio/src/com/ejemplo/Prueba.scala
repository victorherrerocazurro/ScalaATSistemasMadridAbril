package com.ejemplo

object Prueba extends App {

  //Definiciones
  
  def retornaUnReal(valor : Double): Double = {valor}
  
  def retornaUnInt(edad: Int) = edad
  
  def retornaUnString = {"Hola!"}
  
  def retornaUnString(saludo : String) = {saludo}
  
  def retornaUnString(saludo : String, edad : Int) = {saludo + edad}
  
  def noRetornaNada {"Hola!"}
  
  //Invocaciones
  
  retornaUnString
  
  var entero = Prueba retornaUnInt 12
  
  var booleano = (Prueba retornaUnInt 12) != 13
  
  var texto = Prueba retornaUnString "Pepe"
  
  
  //Uso de Accesor Y Mutator
  
  var pepe = new Persona("Pepe", 12)

  pepe.edad = 19

  var juan = new Cliente("Juan", 32, "Antiguo")

  juan modificarMiNumeroDeCuentaA "Nuevo"

  println(juan)

  //Como es de solo escritura no se puede leer
  //println(juan.numCuenta)

}